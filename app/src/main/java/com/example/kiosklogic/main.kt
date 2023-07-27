import com.example.kiosklogic.LanguageClass
import com.example.kiosklogic.englishLanguage
import java.lang.NumberFormatException
import java.util.Locale


fun main() {
    val languageClass = LanguageClass()
    println("==========따릉이에 오신 것을 환영합니다==========")


    while (true) {

        var currentLocale = languageClass.getCurrentLocal()
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
                1 -> println("languageClass.goToFeesandPayment()")
                2 -> println("languageClass.goToBreakdownReportPage()")
                3 -> println("englishLanguage(languageClass)")


                4 -> println("languageClass.goToMapGuidePage()")
                5 -> println("languageClass.goToAdminMode()")
                else -> {
                    println("다시 선택해주세요.")

                }
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요.")
        }
    }
}

