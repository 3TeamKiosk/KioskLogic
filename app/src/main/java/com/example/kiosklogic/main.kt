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
        var changeMode: Map<String, List<() -> Unit>> = mapOf(
            "관리자" to listOf(
                { AdminCharge().changeMoney() },
                { reportAdmin(myTroubleReport) },
                { englishLanguage(languageClass) },
                { mapInformationAdmin() },
                { changeMode() }
            ),
            "사용자" to listOf(
                { userCharge() },
                { userReport(myTroubleReport) },
                { englishLanguage(languageClass) },
                { mapInformation() },
                { changeMode() }
            )
        )

        var currentLocale = languageClass.getCurrentLocal()
        val map: Map<Locale, Map<String, List<String>?>> = mapOf(
            Locale("ko") to mapOf(
                "사용자" to listOf("요금 및 결제", "고장 신고", "외국어", "지도 안내", "모드 변경"),
                "관리자" to listOf("요금 변경", "신고 관리", "외국어", "역 설명 관리", "모드 변경")
            ),
            Locale("en") to mapOf(
                "사용자" to listOf(
                    "Fees and Payment",
                    "Breakdown Report",
                    "Foreign Language",
                    "Map Guide",
                    "Admin Mode"
                ),
                "관리자" to listOf(
                    "Fees Change",
                    "Report Management",
                    "Foreign Language",
                    "Station Description Management",
                    "Mode Change"
                )
            )
        )
        println("===[메인메뉴]===")
        for ((index, item) in map[currentLocale]?.get(mode)?.withIndex()
            ?: emptyList<String>().withIndex()) {
            print("${index + 1}.$item ")
        }
        print("\n입력:")
        try {
            var select = readLine()!!.toInt()
            changeMode[mode]?.get(select - 1)?.invoke()
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요.")
        }
    }
}
