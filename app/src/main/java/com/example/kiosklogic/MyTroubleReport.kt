package com.example.kiosklogic

open class MyTroubleReport: TroubleReport<String, String> {
    // 내부적으로 MutableMap을 사용하여 데이터 관리
    private val map = mutableMapOf<String, String>()

    // 데이터 삽입 구현
    override fun troubleReportInsertion(key: String, value: String) {
        map[key] = value
    }
    // 데이터 수정
    operator fun set(key: String, value: String) {
        map[key] = value
    }
    // 데이터 삭제 구현
    override fun troubleReportRemove(key: String) {
        map.remove(key)
    }
    // key에 해당하는 value을 가져오는 로직
    override fun troubleReportGet(key: String): String? {
        return map[key]
    }
    // 맵에 저장된 모든 key-value 비우기
    override fun troubleReportClear() {
        map.clear()
    }
    fun showReport(){
        map.forEach{ (key, value) ->
            println("신고자: $key   내용: $value") }
    }
    // 맵에 특정 키가 포함되어 있는지 여부를 반환하는 함수 구현
    override fun containsName(key: String): Boolean {
        return map.containsKey(key)
    }

    // 데이터 클래스의 객체를 이용하여 데이터 삽입하기
    fun addTroubleReport(data: ReportDataBase) {
        map[data.reportName] = data.reportText
    }

    // 데이터 클래스의 객체를 이용하여 모든 데이터 출력하기
    fun showAllTroubleReports() {
        map.forEach { (reportName, reportText) ->
            println("신고자: $reportName, 내용: $reportText")
        }
}
}
