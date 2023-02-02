package com.example.translator_kmm.translate.data.translate

import kotlinx.serialization.SerialName

// Data transfer object - These define the structure of data sent and received via json
// Annotate @Serializable because we want to serialise to JSON
@kotlinx.serialization.Serializable
class TranslateDto(
    // We add a SerialName in order to use the exact name of the parameter, then we can call the variable whatever we want
    @SerialName("q") val textToTranslate: String,
    @SerialName("source") val sourceLanguageCode: String,
    @SerialName("target") val targetLanguageCode: String
)