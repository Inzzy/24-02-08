package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_ifelseif {

    public void testSwitchVendingMachine() {

        /* 수업목표. Switch 문 내의 break 문에 대해 흐름을 이해하고 적용할 수 있다. */
        /* 필기. Switch 문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */

        /* 필기. Switch 문을 이용한 간단한 자판기 만들어보기 */
        System.out.println("=========하이미디어 자판기=========");
        System.out.println("사이다 콜라 커피 우유 수정과");
        System.out.println("================================");
        System.out.print("음료를 선택해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectDrink = sc.nextLine();

        int price = 0;

        switch (selectDrink) {

            case "수정과":
                System.out.println("수정과를 선택하셨군요~");
                price = 2000;
                break;

            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 2000;
                break;

            case "커피":
                System.out.println("커피를 왜 선택하셨습니까?");
                price = 1000;
                break;

            case "콜라":
                System.out.println("콜라를 왜 선택하셨어요?");
                price = 2500;
                break;

            case "우유":
                System.out.println("우유를 선택하셨네요?");
                price = 800;
                break;

        }

        System.out.println(price + "원을 투입해주세요");
    }

}
