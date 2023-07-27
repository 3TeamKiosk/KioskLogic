package com.example.kiosklogic.menu.admin

import com.example.kiosklogic.data.MapInformationData

fun mapInformationAdmin() {
//    val information = MapInformationData()
    val information = MapInformationData.getInstance()  // 싱글턴 인스턴스 사용
    println("=== 관리자 모드로 실행하였습니다. ===")
    while (true) {
        print("현재 역: ") // 현 역 이름 불러오기
        for (i in 0 until 5) {
            print("${i + 1})${information.getStationName(i)}역 ")
        }
        println("\n[1]역이름 변경 [2]역설명 변경 [3]현 자전거 수 변경 [4]메인 메뉴")
        val input = readOnlyInt("입력 : ", 4)
        if (input == 4) {   // 4이면 되돌아가기
//            mapInformation()  // main으로 돌아가기
            println("메인으로 돌아갑니다.")
            break
        }
        val fixed = readOnlyInt("변경하는 역 번호 : ", 5) - 1   // 1~5 까지 역의 숫자를 받지만
        when (input) {  // 1~3 받아서 그에 해당하는 기능 실행
            1 -> {
                println("현 역이름 : ${fixed.let { information.getStationName(it) }}")
                val fixContent = readLine()
                fixed.let { information.setStationName(it, fixContent ?: "") }  // 역 이름 재설정
            }

            2 -> {
                println("현 설명 : ${fixed.let { information.getStationDescription(it) }}")
                val fixContent = readLine()
                fixed.let { information.setStationDescription(it, fixContent ?: "") }   // 역 설명 재설정
            }

            3 -> {
                println("현 자전거 수: ${fixed.let { information.getBicycleCount(it) }}")
                val fixContent = readOnlyInt("변경할 자전거 수: ")
                fixed.let { information.setBicycleCount(it, fixContent) }   // 역 현 자전거 수 재설정
            }
        }

    }
}

fun readOnlyInt(
    message: String,
    range: Int? = null
): Int { // 오직 숫자만 무한 입력 유도&range 1~ range까지 0이면 if x
    var input: Int? = null
    while (true) {
        print(message)
        try {
            input = readLine()?.toInt() ?: continue
            if (range != null) {    // range 안 받았으면 1~range 숫자 유도 x
                if (input in 1..range) return input
                else println("유효한 값이 아닙니다. 1 ~ ${range}을 입력해주세요.")
            } else return input
        } catch (e: NumberFormatException) {
            println("숫자가 아닙니다. 다시 입력해주세요.")
        }
    }
}
