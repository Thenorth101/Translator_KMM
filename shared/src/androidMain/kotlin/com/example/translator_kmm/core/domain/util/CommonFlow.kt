package com.example.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.Flow

// Android implementation of Flow
actual class CommonFlow<T> actual constructor(
    private val flow: Flow<T>
) : Flow<T> by flow