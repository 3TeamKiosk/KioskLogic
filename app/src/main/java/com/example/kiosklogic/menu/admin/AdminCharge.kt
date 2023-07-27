package com.example.kiosklogic.menu.admin

class AdminCharge {
    fun changeMoney() {
        println("[대여비용 변경]")
        var rentalMoney =
            mutableMapOf("1" to 1000, "2" to 2000, "3" to 3000, "4" to 4000, "5" to 5000)

        while (true) {
            println("[1] 대여시간 추가/수정")
            println("[2] 대여시간 삭제")
            println("[3] 전체보기")
            println("[4] 메인으로")
            print("숫자를 입력하세요: ")

            when (readLine()?.toIntOrNull()) {
                1 -> addOrUpdateItem(rentalMoney)
                2 -> deleteItem(rentalMoney)
                3 -> printAllItems(rentalMoney)
                4 -> break  // 메인으로
                else -> println("다시 입력하세요.")
            }
        }
    }

    private fun addOrUpdateItem(map: MutableMap<String, Int>) {
        print("추가 및 수정하려는 시간을 입력하세요: ")
        val key = readLine() ?: return

        print("추가 및 수정 금액을 입력하세요: ")
        val value = readLine()?.toIntOrNull() ?: return

        map[key] = value
        println("${key} 시간 대여 금액이 추가 및 수정되었습니다.")
    }

    private fun deleteItem(map: MutableMap<String, Int>) {
        print("삭제하려는 시간을 입력하세요: ")
        val key = readLine() ?: return

        if (map.containsKey(key)) {
            map.remove(key)
            println("$key 시간 대여 정보가 삭제되었습니다.")
        } else {
            println("${key}시간 대여 정보를 찾을 수 없습니다.")
        }
    }

    private fun printAllItems(map: Map<String, Int>) {
        if (map.isEmpty()) {
            println("정보가 없습니다.")
        } else {
            for ((key, value) in map) {
                println("${key}시간 대여: ${value}원")
            }
        }
    }


}