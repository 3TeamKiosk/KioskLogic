package com.example.kiosklogic

/* 맵을 사용한 것
fun payment(rentalMoney: MutableMap<String, Int>) {
    var rentalHour = readLine()!!.toInt()

    while (true) {
        try {
            val valueAtIndex = rentalMoney["$rentalHour"]
            if (valueAtIndex != null) {
                println("${rentalHour}시간 대여료 : ${valueAtIndex}원 결제하시겠습니까?")
                println("[1]예 [2]아니오")
                var check = readLine()!!.toInt()
                var myMoney = 3000
                var change = myMoney - valueAtIndex
                if (check == 1) {
                    if (myMoney >= valueAtIndex) {
                        println("[나의 금액]: ${myMoney}원")
                        println("[대여 후 나의 잔액]: ${change}원입니다.")
                    } else {
                        println("[나의 금액]: ${myMoney}원")
                        println("${valueAtIndex - myMoney} 원 부족합니다.")
                        println("결제 실패. 메인으로 이동합니다.")
                        return main()
                    }
                } else if (check == 2) {
                    println("메인화면으로 이동합니다.")
                    return main()
                } else {
                    println("1, 2의 숫자중에서 다시 입력하세요.")
                    return payment(rentalMoney)
                }
            } else {
                println("1~5 사이의 숫자를 입력하세요.")
                return payment(rentalMoney)
            }
        } catch (e: NumberFormatException) {
            println("1~5 사이의 숫자를 입력하세요.")
        }
    }
}
*/
class Payment {
    var myMoney = 3000
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
                            println("[나의 금액]: ${myMoney}원")
                            println("[대여 후 나의 잔액]: ${change}원입니다.")
                        } else {
                            println("[나의 금액]: ${myMoney}원")
                            println("${myMoney-valueAtIndex} 원 부족합니다.")
                            println("결제 실패. 메인으로 이동합니다.")
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