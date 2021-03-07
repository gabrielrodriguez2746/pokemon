package com.learning.network.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
object NetworkModule {

    @Provides
    @Reusable
    fun provideServiceFactory(
        configuration: NetworkConfiguration
    ): ServiceFactory {
        return RetrofitServiceFactory(
            Retrofit.Builder()
                .client(getOkHttpClient(configuration))
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(configuration.baseUrl())
                .build()
        )
    }

    private fun getOkHttpClient(configuration: NetworkConfiguration): OkHttpClient {
        return OkHttpClient.Builder().apply {
            readTimeout(configuration.readTimeOut.first, configuration.readTimeOut.second)
            connectTimeout(
                configuration.connectTimeOut.first,
                configuration.connectTimeOut.second
            )
            addInterceptor(getHeaderInterceptor())
        }.build()
    }

    private fun getHeaderInterceptor(): Interceptor {
        return Interceptor {
            val requestBuilder = it.request().newBuilder()
            requestBuilder
                .header(
                    "Accept",
                    "application/json"
                )
                .header(
                    "Content-Type",
                    "application/json"
                )
                .method(it.request().method(), it.request().body())
            it.proceed(requestBuilder.build())
        }
    }

}