package com.example.kiosklogic.data

import com.example.kiosklogic.interfaces.PaymentInformation

class PaymentClass : PaymentInformation<String, Int> {
    private var rentalTime = mapOf(
        "[1]" to "1시간 대여",
        "[2]" to "2시간 대여",
        "[3]" to "3시간 대여",
        "[4]" to "4시간 대여",
        "[5]" to "5시간 대여"
    )
    var rentalMoney = mutableMapOf("1" to 1000, "2" to 2000, "3" to 3000, "4" to 4000, "5" to 5000)

    override fun chargeInfo() {
        rentalMoney.forEach { (k, v) ->
            println("${k}시간 대여 : ${v}원")
        }
        println("==============================")
        println("[1]결제하기 [2]메인으로")
    }

    override fun paymentInfo() {
        rentalTime.forEach { (k, v) ->
            println("$k $v")
        }
    }

    fun payment() {
        var rentalTime = readLine()!!.toString()
        while (true) {
            try {
                val valueAtIndex = rentalMoney["$rentalTime"]
                if (valueAtIndex != null) {
                    println("${rentalTime}시간 대여료 : ${valueAtIndex}원 결제하시겠습니까?")
                    println("[1]예 [2]아니오")
                    var check = readLine()!!.toInt()
                    var myMoney = 3000
                    var change = myMoney - valueAtIndex
                    when (check) {
                        1 -> {
                            if (myMoney >= valueAtIndex) {
                                println("[나의 금액]: ${myMoney}원")
                                println("[대여 후 나의 잔액]: ${change}원입니다.")
                                break
                            } else {
                                println("[나의 금액]: ${myMoney}원")
                                println("${valueAtIndex - myMoney} 원 부족합니다.")
                                println("결제 실패. 메인으로 이동합니다.")
                                break   // 메인으로
                            }

                        }

                        2 -> {
                            println("메인화면으로 이동합니다.")
                            break
                        }

                        else -> {
                            println("1, 2의 숫자중에서 다시 입력하세요.")
                            return com.example.kiosklogic.menu.user.payment(rentalMoney)
                        }
                    }
                } else {
                    println("1~5 사이의 숫자를 입력하세요.")
                    return com.example.kiosklogic.menu.user.payment(rentalMoney)
                }
            } catch (e: NumberFormatException) {
                println("1~5 사이의 숫자를 입력하세요.")
            }
        }
    }
}
