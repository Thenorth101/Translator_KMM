package com.example.translator_kmm.translate.domain.translate

import com.example.translator_kmm.core.domain.language.Language

interface TranslateClient {

    // Here we just define the functions that our translator should have
    suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String
}
