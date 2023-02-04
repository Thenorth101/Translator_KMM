package com.example.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.StateFlow

// Common StateFlow implementation
expect class CommonStateFlow<T>(flow: StateFlow<T>) : StateFlow<T>

fun <T> StateFlow<T>.toCommonStateFlow() = CommonStateFlow(this)