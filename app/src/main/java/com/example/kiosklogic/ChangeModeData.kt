package com.example.kiosklogic

class ChangeModeData : ChangeModeInterface {
    var nowMode="사용자"
    var modeType : List<String> = listOf("사용자","관리자")
    override fun getMode(): String {
        return nowMode
    }

    override fun setMode() {
        
    }

}