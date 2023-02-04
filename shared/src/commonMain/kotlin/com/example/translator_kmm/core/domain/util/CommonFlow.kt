package com.example.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.Flow

// Common flow implementation
expect class CommonFlow<T>(flow: Flow<T>) : Flow<T>

fun <T> Flow<T>.toCommonFlow() = CommonFlow(this)