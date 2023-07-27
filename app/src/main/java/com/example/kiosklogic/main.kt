package com.example.kiosklogic

fun main() {

    println("[1]요금안내 [2]결제하기 [3]메인 [4]관리자모드")
    var checkNum1 = readLine()!!.toInt()
    while (true) {
        try {
            // [1]요금 안내를 선택했을 때의 화면
            if(checkNum1 == 1){
                var charge = ChargeInfo()
                charge.chargeInfo()
                while(true){
                    // 요금안내 화면 안에서 결제하기 or 메인으로 돌리는 코드
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
                        charge.chargeInfo()
                    }
                }
                //메인에서 [2]결제하기로 바로갔을 때의 화면
            } else if(checkNum1 == 2){
                println("대여 시간을 입력해주세요")
                var pay = PaymentInfo()
                pay.paymentInfo()
                var money = Payment()
                money.payment()
                //1~5까지의 숫자나 정수가 아니면 다시 입력하게 함
//                when(readLine()?.toIntOrNull()){
//                    1,2,3,4,5 -> money.payment()
//                    else -> println("다시 입력하세요.")
//                }
                // 메인으로 이동
            } else if(checkNum1 == 3){
                println("요금안내 및 결제화면 메인으로 이동합니다")
                return main()
                // 관리자 모드로 이동
            } else if(checkNum1 == 4){
                var admin = AdminCharge()
                admin.changeMoney()
            } else {
                println("다시 입력하세요.")
                return main()
            }; break

        } catch (e: java.lang.NumberFormatException) {
            println("잘못된 입력입니다.")
        }

    }
}
