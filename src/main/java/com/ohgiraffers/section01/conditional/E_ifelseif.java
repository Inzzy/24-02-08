package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class E_ifelseif {

    public void testSimpleIfElseIfStatement() {

        System.out.println("스폰지밥은 친구 뚱이를 만났다.");
        System.out.println("그런데, 뚱이 얼굴이 퉁퉁 부었다.");
        System.out.println("이를 본 스폰지밥이 물었다.");
        System.out.println("뚱이 : 사실은 말이야...");

        System.out.println("스폰지밥 : 뚱아,얼굴이 왜 부었니?게살버거를 먹고 잔 거 아니야??");
        System.out.println("(1.도라에몽 : (뚱이 얼굴을 꼬집으며)내 간식을 훔쳐먹다니!!");
        System.out.println("2.뚱이네 누나 : (Free 싸대기 막 날리며)하라는 운동은 안하고!!");
        System.out.print("3.호빵맨 : (자는 뚱이얼굴을 막치면서 깨운다)뚱아,일어나~놀자!!!) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();



        if (answer == 1) {

            System.out.println("스폰지밥 : 남의 것을 훔치면 안돼!!");

        } else if (answer == 2) {

            System.out.println("스폰지밥 : 너 진짜로 운동 해야겠다ㅋㅋㅋ");

        } else if (answer == 3) {

            System.out.println("스폰지밥 : 이 잠꾸러기야~넌 너무 게을러빠졌어ㅋㅋㅋ");

        } else {

            System.out.println("잘못된 값을 입력하셨습니다.");

        }

            System.out.println("스폰지밥은 그런 뚱이를 놀렸다.");

    }

}
