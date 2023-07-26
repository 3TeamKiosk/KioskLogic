package com.example.kiosklogic

class ChargeInfo {
    fun chargeInfo(){
        println("[요금 안내]")
        var rentalMoney = mapOf("1" to 1000, "2" to 2000, "3" to 3000, "4" to 4000, "5" to 5000)

        for((k,v) in rentalMoney){
            println("${k}시간 대여 : ${v}원")
        }

        println("==============================")
        println("[1]결제하기 [2]메인으로")
    }
}