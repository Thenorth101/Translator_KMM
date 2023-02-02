package com.example.translator_kmm.translate.data.translate

// Data transfer object - Response
@kotlinx.serialization.Serializable
data class TranslatedDto(
    val translatedText: String
)