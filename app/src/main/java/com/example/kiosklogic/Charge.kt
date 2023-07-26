package com.example.kiosklogic

class Charge {
    fun charge() {
        while (true) {
            try {
                var time = readLine()!!.toInt()
                if (time == 1) {
                    println("1시간 대여료 1,000원 입니다. 결제 하시겠습니까?")
                    println("[1]예 [2]아니오")
                    var check = readLine()!!.toInt()
                    if (check == 1) {
                        println("결제화면으로 이동합니다.")
                    } else if (check == 2) {
                        println("메인화면으로 이동합니다.")
                    } else {
                        print("1, 2, 3, 4, 5, 6 중 다시 입력해주세요")
                    }
                } else if (time == 2) {
                    println("2시간 대여료 2,000원 입니다. 결제 하시겠습니까?")
                    println("[1]예 [2]아니오")
                    var check = readLine()!!.toInt()
                    if (check == 1) {
                        println("결제화면으로 이동합니다.")
                    } else if (check == 2) {
                        println("메인화면으로 이동합니다.")
                    } else {
                        print("1, 2, 3, 4, 5, 6 중 다시 입력해주세요")
                    }
                } else if (time == 3) {
                    println("3시간 대여료 3,000원 입니다. 결제 하시겠습니까?")
                    println("[1]예 [2]아니오")
                    var check = readLine()!!.toInt()
                    if (check == 1) {
                        println("결제화면으로 이동합니다.")
                    } else if (check == 2) {
                        println("메인화면으로 이동합니다.")
                    } else {
                        print("1, 2, 3, 4, 5, 6 중 다시 입력해주세요")
                    }
                } else if (time == 4) {
                    println("4시간 대여료 4,000원 입니다. 결제 하시겠습니까?")
                    println("[1]예 [2]아니오")
                    var check = readLine()!!.toInt()
                    if (check == 1) {
                        println("결제화면으로 이동합니다.")
                    } else if (check == 2) {
                        println("메인화면으로 이동합니다.")
                    } else {
                        print("1, 2, 3, 4, 5, 6 중 다시 입력해주세요")
                    }
                } else if (time == 5) {
                    println("5시간 대여료 5,000원 입니다. 결제 하시겠습니까?")
                    println("[1]예 [2]아니오")
                    var check = readLine()!!.toInt()
                    if (check == 1) {
                        println("결제화면으로 이동합니다.")
                    } else if (check == 2) {
                        println("메인화면으로 이동합니다.")
                    } else {
                        print("1, 2, 3, 4, 5, 6 중 다시 입력해주세요")
                    }
                } else if (time == 6) {
                    println("24시간 대여료 6,000원 입니다. 결제 하시겠습니까?")
                    println("[1]예 [2]아니오")
                    var check = readLine()!!.toInt()
                    if (check == 1) {
                        println("결제화면으로 이동합니다.")
                    } else if (check == 2) {
                        println("메인화면으로 이동합니다.")
                    } else {
                        print("1, 2, 3, 4, 5, 6 중 다시 입력해주세요")
                    }
                }; break
            } catch (e: java.lang.NumberFormatException) {
                println("숫자를 입력하세요")
            }
        }
    }
}

