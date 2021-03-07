package com.learning.pokemon.showcase.di

import com.learning.network.di.BaseUrl
import com.learning.network.di.NetworkConfiguration
import com.learning.network.di.NetworkModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(
    includes = [
        NetworkModule::class
    ]
)
@InstallIn(SingletonComponent::class)
object AppNetworkModule {

    @Provides
    fun providePokemonNetworkConfiguration(): NetworkConfiguration {
        return NetworkConfiguration(baseUrl = BaseUrl(BASE_URL))
    }

}

private const val BASE_URL = "https://pokeapi.co/api/v2/"