package com.learning.network.di

import kotlin.reflect.KClass

interface ServiceFactory {

    fun <T: Any> get(service: KClass<T>): T

}