package com.example.kiosklogic.data

import com.example.kiosklogic.interfaces.LanguageInterface
import java.util.Locale

class LanguageClass : LanguageInterface {

    var currentLocale: Locale = Locale("ko")

    override fun changeLanguageToEnglish() {
        currentLocale = Locale("en")
    }

    override fun changeLanguageToKorean() {
        currentLocale = Locale("ko")
    }

    override fun goToFeesandPayment() {
        val chargePageText = when (currentLocale) {
            Locale("en") -> "Go to fees and payment page."
            else -> "요금 및 결제 페이지로 이동합니다."
        }
        println(chargePageText)
    }

    override fun goToBreakdownReportPage() {
        val breakdownReportPageText = when (currentLocale) {
            Locale("en") -> "Go to break down report page."
            else -> "고장 신고 페이지로 이동합니다."
        }
        println(breakdownReportPageText)
    }

    override fun goToMapGuidePage() {
        val mapGuidePageText = when (currentLocale) {
            Locale("en") -> "Go to map guide page."
            else -> "지도 안내 페이지로 이동합니다."
        }
        println(mapGuidePageText)
    }

    override fun goToAdminMode() {
        val adminModeText = when (currentLocale) {
            Locale("en") -> "Go to Admin Mode."
            else -> "관리자 모드로 이동합니다."
        }
        println(adminModeText)
    }

    override fun getCurrentLocal(): Locale {
        return currentLocale
    }
}