import com.example.kiosklogic.menu.admin.AdminCharge
import com.example.kiosklogic.data.ChangeModeData
import com.example.kiosklogic.data.LanguageClass
import com.example.kiosklogic.data.MyTroubleReport
import com.example.kiosklogic.data.PaymentClass
import com.example.kiosklogic.menu.user.changeMode
import com.example.kiosklogic.menu.user.englishLanguage
import com.example.kiosklogic.menu.user.mapInformation
import com.example.kiosklogic.menu.admin.mapInformationAdmin
import com.example.kiosklogic.menu.admin.reportAdmin
import com.example.kiosklogic.menu.user.userCharge
import com.example.kiosklogic.menu.user.userReport
import java.lang.NumberFormatException
import java.util.Locale


fun main() {
    val languageClass = LanguageClass()
    val myTroubleReport = MyTroubleReport()
    val modeData = ChangeModeData.getInstance()
    var payService = PaymentClass()
    println("==========따릉이에 오신 것을 환영합니다==========")

    while (true) {
        var mode = modeData.getMode()   // ChangeModeData에서 현재 모드 가져오기
        var changeMode: Map<String, List<() -> Unit>> = mapOf(  // 관리자/사용자에 따른 페이지 path
            "관리자" to listOf(
                { AdminCharge().changeMoney(payService) },
                { reportAdmin(myTroubleReport) },
                { englishLanguage(languageClass) },
                { mapInformationAdmin() },
                { changeMode() }
            ),
            "사용자" to listOf(
                { userCharge(payService) },
                { userReport(myTroubleReport) },
                { englishLanguage(languageClass) },
                { mapInformation() },
                { changeMode() }
            )
        )

        var currentLocale = languageClass.getCurrentLocal() // 현재 언어
        val map: Map<Locale, Map<String, List<String>?>> = mapOf(   // 언어+모드에 따른 메뉴 언어 변경
            Locale("ko") to mapOf(
                "사용자" to listOf("요금 및 결제", "고장 신고", "외국어", "지도 안내", "모드 변경"),
                "관리자" to listOf("요금 변경", "신고 관리", "외국어", "역 설명 관리", "모드 변경"),
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
        for ((index, item) in map[currentLocale]?.get(mode)?.withIndex()    // 메뉴 출력
            ?: emptyList<String>().withIndex()) {
            print("${index + 1}.$item ")
        }
        println("")
        var select: Int?
        while (true) {  // 숫자 입력 + 1~5입력 유도
            try {
                print("입력: ")
                select = readLine()!!.toInt()
                if (select in 1..5) break
                else println("유효한 값이 아닙니다. 1 ~ 5를 입력해주세요")
            } catch (e: NumberFormatException) {
                println("숫자를 입력해주세요.")
            }
        }
        if (select != null) {
            changeMode[mode]?.get(select - 1)?.invoke() // 해당 맞는 page 이동
        }
    }
}
