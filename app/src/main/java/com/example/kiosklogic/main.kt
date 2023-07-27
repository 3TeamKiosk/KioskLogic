package com.example.kiosklogic

import java.util.Scanner

fun main()= with(Scanner(System.`in`)) {
    val adminReport = MyTroubleReport()
    println("실행하실 모드를 선택하시오")
    println("1. 사용자모드")
    println("2. 관리자 모드")
    println("3. 종료")

    var select: Int

    while (true) {
        print("번호 입력 :")
        select = this.nextInt()

        if (select == 1){
            println("사용자 모드를 선택했습니다.")
            userReport(adminReport)
        }
        if (select == 2){
            println("관리자 모드를 선택했습니다.")
            reportAdmin(adminReport)
        }
        if (select == 3){
            print("종료합니다.")
            break
        }

    }


}