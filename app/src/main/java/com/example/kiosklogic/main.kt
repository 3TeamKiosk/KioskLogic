import com.example.kiosklogic.AdminCharge
import com.example.kiosklogic.ChangeModeData
import com.example.kiosklogic.LanguageClass
import com.example.kiosklogic.MyTroubleReport
import com.example.kiosklogic.changeMode
import com.example.kiosklogic.englishLanguage
import com.example.kiosklogic.mapInformation
import com.example.kiosklogic.mapInformationAdmin
import com.example.kiosklogic.reportAdmin
import com.example.kiosklogic.userCharge
import com.example.kiosklogic.userReport
import java.lang.NumberFormatException
import java.util.Locale


fun main() {
    val languageClass = LanguageClass()
    val myTroubleReport = MyTroubleReport()
    val modeData = ChangeModeData.getInstance()
    println("==========따릉이에 오신 것을 환영합니다==========")


    while (true) {
        var mode = modeData.getMode()
        var changeMode: Map<String,List<Unit>> = mapOf(
           "관리자" to listOf<Unit>(AdminCharge().changeMoney(), reportAdmin(myTroubleReport), englishLanguage(languageClass), mapInformationAdmin(), changeMode()),
           "사용자" to listOf<Unit>(userCharge(), userReport(myTroubleReport), englishLanguage(languageClass), mapInformation(), changeMode())
        )

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
            changeMode[mode]?.get(select)
//            when (select) {
//                1 -> userCharge()
//                2 -> userReport(myTroubleReport)
//                3 -> englishLanguage(languageClass)
//
//                4 -> mapInformation()
//                5 -> changeMode()
//                else -> {
//                    println("다시 선택해주세요.")
//
//                }
//            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요.")
        }
    }
}
