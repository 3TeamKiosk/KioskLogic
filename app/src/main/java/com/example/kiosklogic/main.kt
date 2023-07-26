import java.lang.NumberFormatException

fun main() {
    val kioskName = "따릉이"
    var a = "요금 및 결제"
    var b = "고장 신고"
    var c = "외국어"
    var d = "지도 안내"
    var e = "모드변경"

    println("==========따릉이에 오신 것을 환영합니다==========")
    println("1. $a 2. $b 3. $c 4. $d 5. $e")

    while (true) {
        try {
            var select = readLine()!!.toInt()
            when (select) {
                1 -> goTopaymentPage()
                2 -> goToBreakdownReportPage()
                3 -> {
                    println("Changed language to English.")
                }

                4 -> goToMapGuidePage()
                5 -> goToAdminMode()
                else -> {
                    println("다시 선택해주세요.")
                    break
                }
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요.")
        }
    }
}
fun goTopaymentPage() {
    println("요금 및 결제로 이동합니다.")
}
fun goToBreakdownReportPage() {
    println("고장 신고로 이동합니다.")
}

fun goToMapGuidePage() {
    println("지도 안내로 이동합니다.")
}

fun goToAdminMode() {
    println("관리자 모드로 이동합니다.")
}