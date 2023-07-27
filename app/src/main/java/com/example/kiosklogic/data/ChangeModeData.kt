package com.example.kiosklogic.data

import com.example.kiosklogic.interfaces.ChangeModeInterface

class ChangeModeData : ChangeModeInterface {
    var nowMode = "사용자"

    companion object {  // 싱글턴
        @Volatile
        private var instance: ChangeModeData? = null

        fun getInstance(): ChangeModeData { // 다 같은 interface를 사용하게 유도
            return instance ?: synchronized(this) {
                instance ?: ChangeModeData().also { instance = it }
            }
        }
    }

    override fun getMode(): String {
        return nowMode
    }

    override fun setMode() {
        nowMode = if (nowMode == "사용자") "관리자" else "사용자"
    }

}