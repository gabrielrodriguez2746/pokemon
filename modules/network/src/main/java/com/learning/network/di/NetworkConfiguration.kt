package com.learning.network.di

import java.util.concurrent.TimeUnit

private const val READ_TIME_OUT = 2L
private const val CONNECT_TIME_OUT = 2L

data class NetworkConfiguration(
    val readTimeOut: Pair<Long, TimeUnit> = READ_TIME_OUT to TimeUnit.SECONDS,
    val connectTimeOut: Pair<Long, TimeUnit> = CONNECT_TIME_OUT to TimeUnit.SECONDS,
    val baseUrl: BaseUrl
)


data class BaseUrl(private val url: String) {
    operator fun invoke() = url
}