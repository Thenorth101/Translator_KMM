package com.example.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.StateFlow

// Android implementation of StateFlow
actual class CommonStateFlow<T> actual constructor(
    private val flow: StateFlow<T>
) : StateFlow<T> by flow