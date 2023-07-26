package com.example.kiosklogic
fun main(){
    println("[요금 안내]")
    println("[1]1시간 대여 : 1,000원")
    println("[2]2시간 대여 : 2,000원")
    println("[3]3시간 대여 : 3,000원")
    println("[4]4시간 대여 : 4,000원")
    println("[5]5시간 대여 : 5,000원")
    println("[6]24시간 대여: 10,000원")
    println("==============================")
    println("[사용 시간 선택 및 결제하기]")
    println("사용 시간을 선택해주세요.")

    var money = Charge()
    money.charge()


    }
