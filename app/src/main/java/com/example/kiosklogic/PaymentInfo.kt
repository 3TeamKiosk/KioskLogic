package com.example.kiosklogic

class PaymentInfo {
    fun paymentInfo() {
        var rentalTime = mapOf(
            "[1]" to "1시간 대여",
            "[2]" to "2시간 대여",
            "[3]" to "3시간 대여",
            "[4]" to "4시간 대여",
            "[5]" to "5시간 대여"
        )

        for ((k, v) in rentalTime) {
            println("${k} ${v}")
        }
    }
}