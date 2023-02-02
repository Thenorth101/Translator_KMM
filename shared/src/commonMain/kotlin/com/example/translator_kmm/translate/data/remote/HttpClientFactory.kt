package com.example.translator_kmm.translate.data.remote

import io.ktor.client.*

// expect -> very similar to abstract classes, but we expect this class to have an implementation in all other source packages (androidMain & iosMain)
// Here we just define which functions this class should have
expect class HttpClientFactory {

    //when we create the function, the class will now expect the same in the other source packages
    fun create(): HttpClient
}