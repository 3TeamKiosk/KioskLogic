import com.example.kiosklogic.LanguageClass
import com.example.kiosklogic.englishLanguage
import java.lang.NumberFormatException
import java.util.Locale


fun main() {
    val languageClass = LanguageClass()
    println("==========따릉이에 오신 것을 환영합니다==========")


    while (true) {
        var currentLocale = languageClass.getCurrentLocal()
        var map: Map<Locale, List<String>> = mapOf(
            Locale("ko") to listOf<String>("요금 및 결제", "고장 신고", "외국어", "지도 안내", "모드 변경"),
            Locale("en") to listOf<String>(
                "Fees and Paymentasdff",
                "Breakdown Report",
                "Foreign Language",
                "Map Guide",
                "Admin Mode"
            ),
        )


        for(i: Int in 0..map[currentLocale]!!.size-1) {
            print("${i+1}.${map[currentLocale]?.get(i)} ")
        }





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
