package com.example.translator_kmm.translate.data.remote

import io.ktor.client.*
import io.ktor.client.engine.darwin.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*

// Same implementation for iOS but we use Darwin
actual class HttpClientFactory {

    actual fun create(): HttpClient {
        return HttpClient(Darwin) {
            //install - we can now install Ktor features for Android
            // ContentNegotiation -> is what allows us to parse JSON for Android
            install(ContentNegotiation) {
                json()
            }
        }
    }
}