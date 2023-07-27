package com.example.kiosklogic

import java.util.Locale

interface LanguageInterface {
    fun changeLanguageToEnglish(currentLocale: Locale)
    fun changeLanguageToKorean(currentLocale: Locale)
    fun goToFeesandPayment(currentLocale: Locale)
    fun goToBreakdownReportPage(currentLocale: Locale)
    fun goToMapGuidePage(currentLocale: Locale)
    fun goToAdminMode(currentLocale: Locale)

}
