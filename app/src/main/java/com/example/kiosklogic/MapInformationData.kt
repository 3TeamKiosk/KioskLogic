package com.example.kiosklogic

class MapInformationData : MapInformationInterface {
    var stationName: MutableList<String> = mutableListOf("엑스", "펙토", "패트", "매트", "로눔")
    var stationDescription: MutableList<String> = mutableListOf(
        "지도상 11시 방향",
        "지도상 10시 방향",
        "지도 가운데에서 6시 방향으로 조금 아래에",
        "지도상 7시 방향",
        "지도상 3시 방향",
    )
    var bicycleCount: MutableList<Int> = mutableListOf(3, 1, 5, 6, 3)
    var stationInformation: MutableMap<String, MutableList<Any>> = mutableMapOf(
        "name" to stationName.toMutableList(),
        "description" to stationDescription.toMutableList(),
        "bicycleCount" to bicycleCount.toMutableList(),
    )

    override fun setStationName(index: Int, name: String) {  // 역 이름 변경 (관리자모드)
        stationName[index] = name
    }

    override fun setStationDescription(index: Int, des: String) {    // 역 위치 설명 변경 (관리자모드)
        stationDescription[index] = des
    }

    override fun setBicycleCount(index: Int, count: Int) {   // 사용가능한 자전거 수 변경
        bicycleCount[index] = count
    }

    override fun getStationName(index: Int): String { // 역 이름 가져오기
        return stationName[index]
    }

    override fun getStationDescription(index: Int): String {
        return stationDescription[index]
    }

    override fun getBicycleCount(index: Int): Int {
        return bicycleCount[index]
    }

    override fun getStationInformation(index: Int): String { // 역 설명 이름&위치설명&사용가능한 자전거 수
        return "${index}번째 역은 ${stationInformation["name"]?.get(index - 1)}역입니다.\n" +
                "위치는 ${stationInformation["description"]?.get(index - 1)}에 위치해 있습니다.\n" +
                "현재 사용가능한 자전거 수는 ${stationInformation["bicycleCount"]?.get(index - 1)}개입니다."
    }
}