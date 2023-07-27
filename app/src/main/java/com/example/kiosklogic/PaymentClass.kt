package com.example.kiosklogic

class PaymentClass: PaymentInformation<String, Int> {
    var rentalTime = mapOf(
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
        rentalTime.forEach{(k, v) ->
            println("$k $v")
        }
    }
}