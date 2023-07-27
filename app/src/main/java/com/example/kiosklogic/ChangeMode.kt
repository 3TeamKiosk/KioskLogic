package com.example.kiosklogic

import java.util.Locale

fun changeMode() {
    println("현재 모드입니다.")
    print("변경하시겠습니까? [y/n(메인메뉴)]: ")
    while (true) {
        val input = readLine()
        if (input=="yes"||input=="y"){
            print("모드 변환")
            break
        }
        if (input=="no"||input=="n"){
            print("홈으로")
            break
        }
        print("y/n 으로 입력해주세요: ")
    }
}