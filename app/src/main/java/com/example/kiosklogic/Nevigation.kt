package com.example.kiosklogic

class Nevigation: MyTroubleReport(){
    fun goToBreakdownReportPage() {
        println("고장 신고로 이동합니다.")
        UserReport().main()
    }
    fun goToAdminMode() {
        println("관리자 모드로 이동합니다.")
        AdminReport().main()
    }
}