package com.example.kiosklogic

class UserReport {
    fun main() {
        val report = MyTroubleReport()
        var operate = true

        println("이름과 고장 내역을 입력하세요")
        while (operate) {
            print("이름 : ")
            try {
                var name: String? = readLine() ?: throw  IllegalArgumentException("다시 입력해주세요.");
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
                    //report.showReport()
                    operate = false
                }

                text?.let { name?.let { it1 -> report.troubleReportInsertion(it1, it) } }
                val reportData = ReportDataBase(name ?: "", text?:"")
                report.addTroubleReport(reportData)
            } catch (e: IllegalArgumentException) {
                println("Error")
            }

        }
    }

}