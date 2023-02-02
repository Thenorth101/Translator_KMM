package com.example.translator_kmm.translate.data.remote

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*

// actual -> this is now the actual implementation for Android specifically
actual class HttpClientFactory {

    actual fun create(): HttpClient {
        return HttpClient(Android) {
            //install - we can now install Ktor features for Android
            // ContentNegotiation -> is what allows us to parse JSON for Android
            install(ContentNegotiation) {
                json()
            }
        }
    }
}