package com.learning.network.di

import retrofit2.Retrofit
import kotlin.reflect.KClass


internal class RetrofitServiceFactory(
    private val retrofit: Retrofit
) : ServiceFactory {

    override fun <T : Any> get(service: KClass<T>): T {
        return retrofit.create(service.java)
    }

}