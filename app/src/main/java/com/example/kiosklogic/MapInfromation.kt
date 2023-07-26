package com.example.kiosklogic

import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random

class MapInfromation {
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

    fun lunch() {
        var num: Int?
        println("지도를 선택하고 역을 선택하시면 자세하게 안내해드립니다.")
        println(
            "       .--                    --                                        ,---~~-,--                --\n" +
                    "       ,--                    ~-                                    .,~~-~~-    ,~.                ~\n" +
                    "       ,-,                    ~-                                 .-:~-~~,       ,:.                -\n" +
                    "       ,-,                    ~-                              .,~~--~,          .--                 \n" +
                    ":~~---,~-,                    :-                          ..,~:---,              ,~                 \n" +
                    ",,,,,--:~-,..         ⌈¯¯¯¯¯¯⌉:-                   .-~ .,,-:~--,                 ,~.                \n" +
                    "      .,,~~--,,,,,---,‖   1  ‖;-                 .-;*:~-~~,,---                  .-,                \n" +
                    "         ..,,-~:~~::--⌊______⌋:~              -.-,:;=;=-..   :~                   -~                \n" +
                    "              ....,~,        ,;~~..,      ,;;.:*!;;**:*      ~-.                  -~.               \n" +
                    "                  .~.          -~~;!:.,~-~**=;\$!;#:-:*~       ~~                  ,--              \n" +
                    "           .~;;;~ .-,           .;;;~!\$:!;;*!;:- ~-           :-                   -:              \n" +
                    "           .. . - .-,            -!;!;=:;*::;; ;            ,,~~,                  ~~.              \n" +
                    "           ..~*-- .--             ~;:~*;;;-:-               ;~;=-                  ,-,              \n" +
                    "           .-:;~-  ,-              ,  !;;-                  :~;!~                   ~~              \n" +
                    "            ~:,~-  ,~.                .,-,                  ;::,:,                  ~~.             \n" +
                    "            .,.,  .-:.                  .~,                 ,.,.:,                  ,-,             \n" +
                    "        ~:;⌈¯¯¯¯¯¯⌉;*.                  .:,                     -,             ⌈¯¯¯¯¯¯⌉!,           \n" +
                    "        ,!;‖   2  ‖;*,                   -,                     .:,            ‖   5  ‖:;-          \n" +
                    "        ,::⌊______⌋~*-                   .~,                    ,:,            ⌊______⌋*;~          \n" +
                    "        :~;:~:-::;;;!~                   ,:.                     ,-                 :!!*~           \n" +
                    "        . .-..-. ,,-::                   .-,                     ,:.                 :*;~.          \n" +
                    "              .   ..~~                    ,:.                    ,~,                 ~;=!,          \n" +
                    "                    ,~.                   -:.                     ,~                 ~:;;.          \n" +
                    "                    .--                   .-,                     -:                  ;**-          \n" +
                    "                     ~:                    -;                     ,-,                 ~~~,          \n" +
                    "~                    .~,                    .-.                     ,-.              ~;;*           \n" +
                    "                      ,~.                   .:-                     ,:,               -:.           \n" +
                    ",,.                    .~-.                  .~,                     .-,              .-~,          \n" +
                    "!*!~,,-~,                ,~-,                  ,-.                     ,~           .,,-:~          \n" +
                    "!*!!:;!!:                   ,:--                 ,:.                     ,~.        --,~:,,.        \n" +
                    ":~~!::;,;                    .~~-                ,~.                     .--    .~-,~:-..           \n" +
                    ":*~;;!:;;                      ,~-,            ,~~-~                      -: -:--~:-..              \n" +
                    "::\$;:!!!;                       ,:~,        ,;~-~::;.                     ----~:,                  \n" +
                    ",!!:. -;-                        .-~~.   -:~--:,  -~.                     .-:.                      \n" +
                    "           ...                     ---~~---~.,,,..,~:.,,...... ,..         -:                       \n" +
                    "          -:~--,,.                   ,--,.   ;!=;:*\$#~=!!~~:;!~=!-         -~.                     \n" +
                    "          .,,,,,--                           !~:;!⌈¯¯¯¯¯¯⌉:-=:*!;:.        .-~                      \n" +
                    "                --     ..                    *!;*!‖   3  ‖:-#;!;;!,         ~~                      \n" +
                    "                --    --~,                   ;=*~~⌊______⌋\$\$!*;-.         --.                     \n" +
                    "                --    ~;;:                     ,:.,;~-!!!-~**!..-~           ~~                     \n" +
                    "               .:-    ~!;:~                          -;                      :~                     \n" +
                    "               :-.    ,:-                            ;~                      --,                    \n" +
                    "               :~                                    ,-,                      ~-                    \n" +
                    " ..            ~~                        .,- . -,,..  ~~                      ~-                    \n" +
                    " -~.          .~~                       ,~*=~.~!*:~,. ~-                      ,-,                   \n" +
                    ",;:~.         .--                       ~;*#:!~!*:!,. .--                     .~-                   \n" +
                    "-;:;,         ,-,                       ~~~*;~--!*;.   :-                      ~-                   \n" +
                    "*;:;-         ,-,                       ,-;=!-;~!!~~.  -,                      .~,                  \n" +
                    "==**,         ,-.                       .---.---,---   .~-                   ,:~:,                  \n" +
                    ";**;.         -~⌈¯¯¯¯¯¯⌉~~-.                           .:,                ,~~--:~-                  \n" +
                    "!*:!-         ~~‖   4  ‖--~~.                           ,-.            ,~~---,  ,~.                 \n" +
                    ";=;!-         ~~⌊______⌋  ,~,                           .:,            ---.     ,:.                 \n" +
                    ";\$=*,        ~~           -~                           .~,                     .-,                 \n" +
                    ":**!,         ~~           ,--                           ,~.                     ,~                 \n" +
                    "~;!;,         ~~            ~~                           ,:.                     ,:.                \n" +
                    "-**!-         ,--      .~~, .-~                          ,-.                     ,:.                \n" +
                    ".:!;           :~      -:;,  ~~.,                         ,:                     -~                 \n"
        )
        for (i in 0..4) {
            print("[${i + 1}] ${getStatinName(i)}역 ")
        }
        println("[0]취소")
        while (true) {
            print("입력 : ")
            try {
                num = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                println("숫자가 아닙니다. 0 ~ 5를 입력해주세요")
                continue
            }
            if (num in 0..6) break
            else println("유효한 값이 아닙니다. 0 ~ 5를 입력해주세요")
        }
        if (num == 6) for (i in 0..4) println(getStationInformation(i) + "\n")
        else println(num?.let { getStationInformation(it) })
//        println("4K${Math.random().toInt()}${(100..999).random()}${ThreadLocalRandom.current().nextInt(100,999)}${Random.nextInt()}")
    }

    fun getStationInformation(index: Int): String {
        return "${index + 1}번째 역은 ${stationInformation["name"]?.get(index)}역입니다.\n" +
                "위치는 ${stationInformation["description"]?.get(index)}에 위치해 있습니다.\n" +
                "현 남아있는 자전거 수는 ${stationInformation["bicycleCount"]?.get(index)}개입니다."
    }

    fun setStationName(index: Int, name: String) {
        stationName[index] = name
    }

    fun setStationDescription(index: Int, des: String) {
        stationDescription[index] = des
    }

    fun setBicycleCount(index: Int, count: Int) {
        bicycleCount[index] = count
    }

    fun getStatinName(index: Int): String {
        return stationName[index]
    }
}