package com.example.kiosklogic.menu.user

import com.example.kiosklogic.data.MyTroubleReport

fun userReport(report: MyTroubleReport) {
    var operate = true

    println("이름과 고장 내역을 입력하세요")
    while (operate) {
        print("이름 : ")
        try {
            var name: String? = readLine() ?: throw IllegalArgumentException("다시 입력해주세요.");
            if (name == "q") {
                // q를 누르면 입력 종료
                // report.showAllTroubleReports()
                operate = false
            }

            print("내용 : ")
            var text: String? = readLine() ?: throw IllegalArgumentException("다시 입력해주세요.");
            if (text == "q") {
                // q를 누르면 입력 종료
                //report.showAllTroubleReports()
                operate = false
            }
            report.troubleReportInsertion(name ?: "", text ?: "")
        } catch (e: IllegalArgumentException) {
            println("Error")
        }

    }
}

