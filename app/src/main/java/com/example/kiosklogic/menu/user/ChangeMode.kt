package com.example.kiosklogic.menu.user

import com.example.kiosklogic.data.ChangeModeData

fun changeMode() {
    val modeData = ChangeModeData.getInstance()
    println("현재 ${modeData.getMode()}모드입니다.")
    print("변경하시겠습니까? [y/n(메인메뉴)]: ")
    while (true) {
        val input = readLine()
        when (input) {
            "yes", "y" -> {
                modeData.setMode()
                break
            }

            "no", "n" -> break
            else -> print("y/n 으로 입력해주세요: ")
        }
    }
}