package com.example.kiosklogic
fun main() {

    println("[1]요금안내 [2]결제하기 [3]메인")
    var checkNum1 = readLine()!!.toInt()
    while (true) {
        try {
            if(checkNum1 == 1){
                var charge = ChargeInfo()
                charge.chargeInfo()
                var checkNum2 = readLine()!!.toInt()
                if(checkNum2 == 1){
                    println("대여 시간을 입력해주세요")
                    var pay = PaymentInfo()
                    pay.paymentInfo()
                    var money = Payment()
                    money.payment()
                } else if(checkNum2 == 2){
                    println("메인으로 이동합니다")
                    return main()
                } else{
                    println("다시 입력하세요")
                    return main()
                }

            } else if(checkNum1 == 2){
                println("대여 시간을 입력해주세요")
                var pay = PaymentInfo()
                pay.paymentInfo()
                var money = Payment()
                money.payment()
            } else if(checkNum1 == 3){
                println("요금안내 및 결제화면 메인으로 이동합니다")
                return main()
            } else {
                println("다시 입력하세요.")
                return main()
            }; break

        } catch (e: java.lang.NumberFormatException) {
            println("잘못된 입력입니다.")
        }

    }
}





//    var checkNum = readLine()!!.toInt()
//    while(true){
//        try {
//            if(checkNum == 1){
//                println("대여 시간을 입력해주세요")
//                println("[1]1시간 대여")
//                println("[2]2시간 대여")
//                println("[3]3시간 대여")
//                println("[4]4시간 대여")
//                println("[5]5시간 대여")
//                var money = Payment()
//                money.payment()
//            } else if(checkNum == 2) {
//                println("메인으로 이동합니다.")
//                return main()
//            } else {
//                println("다시 입력하세요.")
//                return main()
//            }; break
//        } catch (e: java.lang.NumberFormatException) {
//            println("다시 입력하세요.")
//        }
//    }







