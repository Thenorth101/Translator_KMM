package com.example.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

// Android implementation of MutableStateFlow
actual class CommonMutableStateFlow<T> actual constructor(
    private val flow: MutableStateFlow<T>
) : MutableStateFlow<T> by flow