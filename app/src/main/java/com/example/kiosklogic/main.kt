package com.example.kiosklogic

import java.util.Scanner


fun main(){
    val report = MyTroubleReport()

    println("이름과 고장 내역을 입력하세요")
    while (true){
        print("이름 : ")
        try {
            var name: String? = readLine() ?:throw  IllegalArgumentException("다시 입력해주세요.");
            if (name == "q") {
                // q를 누르면 입력 종료
                report.showReport()
                break
            }

        print("내용 : ")
            var text:String? = readLine() ?: throw IllegalArgumentException("다시 입력해주세요.");
            if (text == "q"){
                // q를 누르면 입력 종료
                report.showReport()
                break
            }

            text?.let { name?.let { it1 -> report.troubleReportInsertion(it1, it) } }
    }catch (e: IllegalArgumentException){
            println("Error")
    }

    }
}

