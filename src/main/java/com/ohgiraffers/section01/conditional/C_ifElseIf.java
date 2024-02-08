package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleIfElseIfStatement() {

        /* 수업목표. If-Else-If 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *   [If-Else-If 문 표현식]
         *   if(조건식1) {
         *       조건식1 이 참일 때 실행할 명령문;
         *   }
         *   Else If {
         *       조건식1 이 거짓이고, 조건식2 이 참일 때 실행할 명령문;
         *   }
         *   Else {
         *       위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
         *   }
         *  */

        /* 필기.
         *  If-Else-If 문은 조건식1의 결과값이 참이면 else if {} 안에 있는 코드를 실행
         *  */

        System.out.println("산 속에서 나무꾼이 도끼를 연못에 도끼를 빠뜨렸다...");
        System.out.println("나무꾼이 난감해하던 그 때...");
        System.out.println("산신령이 나타나 금도끼,은도끼,쇠도끼를 들고 나타났다.");

        System.out.print("어느 도끼가 네 도끼이느냐? (1.금도끼, 2.은도끼, 3.쇠도끼, 4.없음) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1) {

            System.out.println("이 거짓말쟁이!! 너는 빈털터리일 것이다!!!!");

        } else if (answer == 2) {

            System.out.println("욕심이 과하지는 않았지만, 역시 넌 거짓말을 했으니깐 꺼져!!");

        } else if (answer == 3) {

            System.out.println("오호,너는 정직하구나..(감동)여기 있는 도끼들을 다 가져가거라.");

        } else if (answer == 4) {


            System.out.println("이 거짓말쟁이!!아무것도 네 것이 아니라니!!! 너는 빈털터리일 것이다!!!!");

        } else {

            System.out.println("잘못된 수를 입력하셨습니다.");

        }

            System.out.println("그렇게 산신령은 연못 속으로 사라졌다.");

    }

}