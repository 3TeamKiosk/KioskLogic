package com.example.kiosklogic.menu.user

import com.example.kiosklogic.data.LanguageClass

fun englishLanguage(languageClass: LanguageClass) {
    var eng = languageClass
    println("0.메인으로 돌아가기 1.Changed language to English. 2.한국어로 변경하기")
    val languageSelect = readLine()!!.toInt()
    when (languageSelect) {
        0 -> {
        }

        1 -> {
            eng.changeLanguageToEnglish()
            println("Changed language to English.")
        }

        2 -> {
            eng.changeLanguageToKorean()
            println("한국어로 변경하였습니다.")
        }

        else -> {
            println("다시 선택해주세요.")
        }
    }
}