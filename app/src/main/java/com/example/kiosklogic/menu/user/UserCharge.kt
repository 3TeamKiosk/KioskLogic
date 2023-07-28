package com.example.kiosklogic.menu.user

import com.example.kiosklogic.data.PaymentClass
import com.example.kiosklogic.menu.admin.AdminCharge

fun userCharge(payService: PaymentClass) {

    println("[1]요금안내 [2]결제하기 [3]메인 [4]관리자모드")
    var checkNum1 = readLine()!!.toInt()
    while (true) {
        try {
            // [1]요금 안내를 선택했을 때의 화면
            when (checkNum1) {
                1 -> {
                    payService.chargeInfo()
                    while (true) {
                        // 요금안내 화면 안에서 결제하기 or 메인으로 돌리는 코드
                        var checkNum2 = readLine()!!.toInt()
                        when (checkNum2) {
                            1 -> {
                                println("대여 시간을 입력해주세요")
                                payService.paymentInfo()
                                payService.payment()

                            }

                            2 -> {
                                checkNum1 = 3 //메인으로
                                break
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
                    break
                }

                3 -> {
                    break   // 메인으로 이동
                }

                4 -> {  // 관리자 모드로 이동
                    var admin = AdminCharge()
                    admin.changeMoney(payService)
                }

                else -> {
                    println("다시 입력하세요.")

                }
            }; break

        } catch (e: java.lang.NumberFormatException) {
            println("잘못된 입력입니다.")
        }
    }
}