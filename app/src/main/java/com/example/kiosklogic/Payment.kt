package com.example.kiosklogic

class Payment {
    var myMoney = 10000
    var moneyList = listOf(0, 1000, 2000, 3000, 4000, 5000)
    var rentalHour = readLine()!!.toInt()


    fun payment() {
        while (true) {
    try {
        if (rentalHour >= 0 && rentalHour < moneyList.size) {
            val valueAtIndex = moneyList[rentalHour]
            println("${rentalHour}시간 대여료 : ${valueAtIndex}원 결제하시겠습니까?")
            println("[1]예 [2]아니오")
            var check = readLine()!!.toInt()
            var change = myMoney - valueAtIndex
            if (check == 1) {
                if (myMoney >= valueAtIndex) {
                    println("[대여 후 잔액]: ${change}원입니다.")
                } else {
                    println("금액이 부족합니다.")
                    return main()
                }
            } else if (check == 2){
                println("메인화면으로 이동합니다.")
                return main()
            } else{
                println("1, 2의 숫자중에서 다시 입력하세요.")
                return payment()
            }
        }; break
    } catch (e: java.lang.NumberFormatException) {
        println("1, 2의 숫자중에서 다시 입력하세요.")
    }
}


    }
}
