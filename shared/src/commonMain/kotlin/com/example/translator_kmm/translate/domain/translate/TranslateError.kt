package com.example.translator_kmm.translate.domain.translate

// enum of the various general errors when we make the API call
enum class TranslateError{
    SERVICE_UNAVAILABLE,
    CLIENT_ERROR,
    SERVER_ERROR,
    UNKNOWN_ERROR
}

class TranslateException(val error: TranslateError): Exception(
    message = "An error occurred when translating: $error"
)