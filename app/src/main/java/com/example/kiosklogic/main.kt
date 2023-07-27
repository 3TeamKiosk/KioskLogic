import java.lang.NumberFormatException
import java.util.Locale

var currentLocale: Locale = Locale("ko")

fun main() {

    println("==========따릉이에 오신 것을 환영합니다==========")

    while (true) {
        val kioskName = "따릉이"
        val a = when (currentLocale) {
            Locale("en") -> "Fees and Payment"
            else -> "요금 및 결제"
        }

        val b = when (currentLocale) {
            Locale("en") -> "Breakdown Report"
            else -> "고장 신고"
        }
        val c = when (currentLocale) {
            Locale("en") -> "Foreign Language"
            else -> "외국어"
        }
        val d = when (currentLocale) {
            Locale("en") -> "Map Guide"
            else -> "지도 안내"
        }
        val e = when (currentLocale) {
            Locale("en") -> "Admin Mode"
            else -> "모드 변경"
        }
        val menuOptions = "1.$a 2.$b 3.$c 4.$d 5.$e"
        println(menuOptions)

        try {
            var select = readLine()!!.toInt()
            when (select) {
                1 -> goTofeesandPayment()
                2 -> goToBreakdownReportPage()
                3 -> {
                    println("1.Changed language to English. 2.한국어로 변경하기")
                    val languageSelect = readLine()!!.toInt()
                    when (languageSelect) {
                        1 -> {
                            changeLanguageToEnglish()
                            println("Changed language to English.")
                        }
                        2 -> {
                            changeLanguageToKorean()
                            println("한국어로 변경하였습니다.")
                        }
                        else -> {
                            println("다시 선택해주세요.")
                        }
                    }
                }
                4 -> goToMapGuidePage()
                5 -> goToAdminMode()
                else -> {
                    println("다시 선택해주세요.")

                }
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요.")
        }
    }
}

fun changeLanguageToEnglish() {
    currentLocale = Locale("en")
}
fun changeLanguageToKorean() {
    currentLocale = Locale("ko")
}
fun goTofeesandPayment() {
    val chargePageText = when (currentLocale) {
        Locale("en") -> "Go to fees and payment page."
        else -> "요금 및 결제 페이지로 이동합니다."
    }
    println(chargePageText)
}
fun goToBreakdownReportPage() {
    val breakdownReportPageText = when (currentLocale) {
        Locale("en") -> "Go to break down report page."
        else -> "고장 신고 페이지로 이동합니다."
    }
    println(breakdownReportPageText)
}

fun goToMapGuidePage() {
    val mapGuidePageText = when (currentLocale) {
        Locale("en") -> "Go to map guide page."
        else -> "지도 안내 페이지로 이동합니다."
    }
    println(mapGuidePageText)
}

    fun goToAdminMode() {
        val adminModeText = when (currentLocale) {
            Locale("en") -> "Go to Admin Mode."
            else -> "관리자 모드로 이동합니다."
        }
        println(adminModeText)
    }
