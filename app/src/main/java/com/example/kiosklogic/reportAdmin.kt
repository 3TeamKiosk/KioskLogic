package com.example.kiosklogic

import java.util.*




fun main()= with(Scanner(System.`in`)) {
    val reportAdmin = MyTroubleReport()

    println("관리자 모드(고장 내역 관리)입니다.")
    println("수행할 기능을 선택하시오")
    println("1. 내역확인")
    println("2. 수정")
    println("3. 삭제")
    println("0. 종료")

    var num: Int
    while (true) {
        print("기능 선택: ")
        num = this.nextInt()

        when (num) {
            1 -> {
                println("현재 접수된 고장 신고 현황입니다.")
                reportAdmin.showReport()
            }
            2 -> {
                println("수정하실 글의 작성자를 입력하세요")
                val fixName = readLine() ?: ""
                println("수정하실 글의 내용을 입력하세요")
                val fixText = readLine() ?: ""
                if (reportAdmin.containsName(fixName)) {
                   reportAdmin[fixName] = fixText
                } else {
                    println("$fixName 작성자의 고장 내역이 없습니다.")
                }
            }
            3 -> {
                println("삭제하실 글의 작성자를 입력하세요.")
                val removeName = readLine() ?: ""
                if (reportAdmin.containsName(removeName)) {
                    reportAdmin.troubleReportRemove(removeName)
                } else {
                    println("$removeName 작성자의 고장 내역이 없습니다.")
                }
            }
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
            else -> {
                println("잘못된 선택입니다. 다시 선택해주세요.")
            }
        }
    }
}


