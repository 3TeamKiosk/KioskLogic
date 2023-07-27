package com.example.kiosklogic

interface TroubleReport<name, text> {
    // 키와 값 추가하는 함수
    fun troubleReportInsertion(key: name, value: text)

    // 주어진 키에 해당하는 값을 삭제하는 함수
    fun troubleReportRemove(key: name)

    // 주어진 키에 해당하는 값을 가져오는 함수
    fun troubleReportGet(key: name): text?

    // 맵에 저장된 모든 키-값 쌍을 비우는 함수
    fun troubleReportClear()

    // 맵에 특정 키가 포함되어 있는지 여부를 반환하는 함수
    fun containsName(key: name): Boolean
}