package com.example.kiosklogic

fun mapInformation() {
    val information = MapInformationData.getInstance()  // 싱글턴 인스턴스 불러오기
    var input: Int?
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
    while (true) {
        for (i in 0..4) print("[${i + 1}]${information.getStationName(i)}역 ")
        println("[6]전체 조회 [0]취소")
        while (true) {  // 원하는 num이 들어올 때까지 실행
            print("입력 : ")
            try {   // 숫자가 아닌 입력 시 에러
                input = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                println("숫자가 아닙니다. 0 ~ 5를 입력해주세요")
                continue
            }
            if (input in 0..6) break  // 0~6의 숫자가 나올 시 반복문 나오기
            else println("유효한 값이 아닙니다. 0 ~ 5를 입력해주세요")  // 0~6의 숫자가 아닐 시 알리기
        }
        if (input == 0) {
//            mapInformationAdmin()   // 0 취소 버튼을 클릭 시 main으로 돌아가기
            println("메인으로 돌아갑니다.")
            break
        }
        if (input == 6) for (i in 1..5) println(information.getStationInformation(i) + "\n")  // 6은 모든 역의 정보를 가져오기
        else println(input?.let { information.getStationInformation(it) } + "\n") // 1~5 선택한 역 정보 가져오기
    }
}
//        println("4K${Math.random().toInt()}${(100..999).random()}${ThreadLocalRandom.current().nextInt(100,999)}${Random.nextInt()}")
