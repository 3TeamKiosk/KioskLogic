package com.example.kiosklogic

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

    fun lunch() {   // 지도 기능을 실행 시 진행되는 코드
        var num: Int?
        println("지도를 선택하고 역을 선택하시면 자세하게 안내해드립니다.")
        println(    // 역 위치를 표시하는 지도
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
            print("[${i + 1}] ${getStationName(i)}역 ")
        }
        println("[0]취소")
        while (true) {  // 원하는 num이 들어올 때까지 실행
            print("입력 : ")
            try {   // 숫자가 아닌 입력 시 에러
                num = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                println("숫자가 아닙니다. 0 ~ 5를 입력해주세요")
                continue
            }
            if (num in 0..6) break  // 0~6의 숫자가 나올 시 반복문 나오기
            else println("유효한 값이 아닙니다. 0 ~ 5를 입력해주세요")  // 0~6의 숫자가 아닐 시 알리기
        }
        if (num == 6) for (i in 0..4) println(getStationInformation(i) + "\n")  // 6은 모든 역의 정보를 가져오기
        else println(num?.let { getStationInformation(it) })    // 1~5 선택한 역 정보 가져오기
//        println("4K${Math.random().toInt()}${(100..999).random()}${ThreadLocalRandom.current().nextInt(100,999)}${Random.nextInt()}")
        if (num==0) print("main으로") // 0 취소 버튼을 클릭 시 main으로 돌아가기

    }

    fun getStationInformation(index: Int): String { // 역 설명 이름&위치설명&사용가능한 자전거 수
        return "${index + 1}번째 역은 ${stationInformation["name"]?.get(index)}역입니다.\n" +
                "위치는 ${stationInformation["description"]?.get(index)}에 위치해 있습니다.\n" +
                "현재 사용가능한 자전거 수는 ${stationInformation["bicycleCount"]?.get(index)}개입니다."
    }

    fun setStationName(index: Int, name: String) {  // 역 이름 변경 (관리자모드)
        stationName[index] = name
    }

    fun setStationDescription(index: Int, des: String) {    // 역 위치 설명 변경 (관리자모드)
        stationDescription[index] = des
    }

    fun setBicycleCount(index: Int, count: Int) {   // 사용가능한 자전거 수 변경
        bicycleCount[index] = count
    }

    fun getStationName(index: Int): String { // 역 이름 가져오기
        return stationName[index]
    }
}