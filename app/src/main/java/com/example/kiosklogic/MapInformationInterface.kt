package com.example.kiosklogic

interface MapInformationInterface {
    fun setStationName(index: Int, name: String)  // 역 이름 변경 (관리자모드)

    fun setStationDescription(index: Int, des: String)    // 역 위치 설명 변경 (관리자모드)

    fun setBicycleCount(index: Int, count: Int)   // 사용가능한 자전거 수 변경

    fun getStationName(index: Int): String // 역 이름 가져오기

    fun getStationDescription(index: Int): String // 역 설명 가져오기

    fun getStationInformation(index: Int): String // 역 설명 이름&위치설명&사용가능한 자전거 수

    fun getBicycleCount(index: Int): Int    // 사용가능한 자전거 수 가져오기
}