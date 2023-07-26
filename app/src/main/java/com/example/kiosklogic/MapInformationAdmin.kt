package com.example.kiosklogic

fun mapInformationAdmin() {
    val information = MapInformationData()
    println("=== 관리자 모드로 실행하였습니다. ===")
    while (true) {
        print("현재 역: ")
        for (i in 0 until 5) {
            print("${i + 1})${information.getStationName(i)}역 ")
        }
        println("\n[1]역이름 변경 [2]역설명 변경 [3]현 자전거 수 변경 [4]메인 메뉴")
        val input = readOnlyInt("입력 : ", 4)
        if (input == 4) {
            println("메인으로 돌아갑니다.")
            continue
        }
        if (input !in 1..3) {
            println("유효한 값이 아닙니다. 1 ~ 3을 입력해주세요.")
            continue
        }
        val fixed = readOnlyInt("변경하는 역 번호 : ", information.stationInformation["name"]?.size)
        when (input) {
            1 -> {
                println("현 역이름 : ${fixed.let { information.getStationName(it) }}")
                val fixContent = readLine()
                fixed.let { information.setStationName(it, fixContent ?: "") }
            }

            2 -> {
                println("현 설명 : ${fixed.let { information.getStationDescription(it) }}")
                val fixContent = readLine()
                fixed.let { information.setStationDescription(it, fixContent ?: "") }
            }

            3 -> {
                println("현 자전거 수: ${fixed.let { information.getBicycleCount(it) }}")
                val fixContent = readOnlyInt("변경할 자전거 수: ")
                fixed.let { information.setBicycleCount(it, fixContent) }
            }
        }

    }
}

fun readOnlyInt(message: String, range: Int? = null): Int {
    var input: Int? = null
    while (true) {
        print(message)
        try {
            input = readLine()?.toInt() ?: continue
            if (range != null) {
                if (input in 1..range) return input
                else println("유효한 값이 아닙니다. 1 ~ ${range}을 입력해주세요.")
            } else return input
        } catch (e: NumberFormatException) {
            println("숫자가 아닙니다. 다시 입력해주세요.")
        }
    }
}
