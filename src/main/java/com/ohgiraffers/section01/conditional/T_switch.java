package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class T_switch {

    public void testSimpleSwitchStatement() {

        /* 수업목표. Switch 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        *   [Switch 문 표현식]
        *   Switch(비교할 변수) {
        *       case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
        *       case 비교값2 : 비교값2과 일치하는 경우 실행할 구문; break;
        *       default : case에 모두 해당하지 않는 경우 실행할 구문; break;
        *   }
        *  */

        /* 필기.
        *   정수 두 개와 연산 기호 문자를 입력 받아서
        *   두 숫자의 연산 결과를 출력해보는 간단한 계산기를 만들어보자.
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해 주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해 주세요 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        /* 연산의 결과를 저장할 변수 생성 */
        int result = 0;

        /* 입력한 연산기호 문자에 따라 연산의 결과가 달라짐 */
        switch (op) {
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;


        }

        System.out.println(first + " " + op + " " + second + " = " + result);



    }

    public void testSwitchVendingMachine() {

        /* 수업목표. Switch 문 내의 break 문에 대해 흐름을 이해하고 적용할 수 있다. */
        /* 필기. Switch 문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */

        /* 필기. Switch 문을 이용한 간단한 자판기 만들어보기 */
        System.out.println("=========하이미디어 자판기=========");
        System.out.println("사이다 콜라 커피 우유 수정과");
        System.out.println("================================");
        System.out.println("음료를 선택해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectDrink = sc.nextLine();

        int price = 0;

        switch (selectDrink) {

            case "수정과":
                System.out.println("수정과를 선택하셨습니다.");
                price = 2000;

            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 2000;

            case "커피":
                System.out.println("커피를 선택하셨습니다.");
                price = 1000;

            case "콜라":
                System.out.println("콜라를 선택하셨습니다.");
                price = 2500;

            case "우유":
                System.out.println("우유를 선택하셨습니다.");
                price = 800;

        }

        System.out.println(price + "원을 투입해주세요");

    }

}
