package com.example.kiosklogic

import java.util.Locale

fun englishLanguage (currentLocale: Locale) {
    var eng = LanguageClass()
    println("1.Changed language to English. 2.한국어로 변경하기")
    val languageSelect = readLine()!!.toInt()
    when (languageSelect) {
        1 -> {
            eng.changeLanguageToEnglish(currentLocale)
            println("Changed language to English.")
        }

        2 -> {
            eng.changeLanguageToKorean(currentLocale)
            println("한국어로 변경하였습니다.")
        }
    }
}