import com.example.kiosklogic.LanguageClass
import com.example.kiosklogic.MyTroubleReport
import com.example.kiosklogic.changeMode
import com.example.kiosklogic.englishLanguage
import com.example.kiosklogic.mapInformation
import com.example.kiosklogic.userReport
import java.lang.NumberFormatException
import java.util.Locale
package com.example.kiosklogic

fun main() {

    println("[1]요금안내 [2]결제하기 [3]메인 [4]관리자모드")
    var checkNum1 = readLine()!!.toInt()
    while (true) {
        try {
            // [1]요금 안내를 선택했을 때의 화면
            when (checkNum1) {
                1 -> {
                  payService.chargeInfo()
                    while(true){
                        // 요금안내 화면 안에서 결제하기 or 메인으로 돌리는 코드
                        var checkNum2 = readLine()!!.toInt()
                        when (checkNum2) {
                            1 -> {
                                println("대여 시간을 입력해주세요")
                                payService.paymentInfo()
                                payService.payment()


                            }
                            2 -> {
                                println("메인으로 이동합니다")
                                return main()
                            }
                            else -> {
                                println("다시 입력하세요")
                                payService.chargeInfo()
                            }
                        }
                    }
                    //메인에서 [2]결제하기로 바로갔을 때의 화면
                }
                2 -> {
                    println("대여 시간을 입력해주세요")
                    payService.paymentInfo()
                    payService.payment()
                    //1~5까지의 숫자나 정수가 아니면 다시 입력하게 함
        //                when(readLine()?.toIntOrNull()){
        //                    1,2,3,4,5 -> money.payment()
        //                    else -> println("다시 입력하세요.")
        //                }
                    // 메인으로 이동
                }
                3 -> {
                    println("요금안내 및 결제화면 메인으로 이동합니다")
                    return main()
                    // 관리자 모드로 이동
                }
                4 -> {
                    var admin = AdminCharge()
                    admin.changeMoney()
                }
                else -> {
                    println("다시 입력하세요.")
                    return main()
                }
            }; break

        } catch (e: java.lang.NumberFormatException) {
            println("잘못된 입력입니다.")
        }

fun main() {
    val languageClass = LanguageClass()
    println("==========따릉이에 오신 것을 환영합니다==========")
    val myTroubleReport : MyTroubleReport = MyTroubleReport()

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
                2 -> userReport(myTroubleReport)
                3 -> englishLanguage(languageClass)


                4 -> mapInformation()
                5 -> changeMode()
                else -> {
                    println("다시 선택해주세요.")

                }
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요.")
        }
    }
}
