package com.example.kiosklogic.interfaces

import java.util.Locale

interface LanguageInterface {
    fun changeLanguageToEnglish()
    fun changeLanguageToKorean()
    fun goToFeesandPayment()
    fun goToBreakdownReportPage()
    fun goToMapGuidePage()
    fun goToAdminMode()
    fun getCurrentLocal(): Locale

}
