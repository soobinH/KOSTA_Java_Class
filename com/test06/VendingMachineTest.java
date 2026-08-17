package com.test06;

import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {
    private static void printMenu() {
        System.out.println("=========================");
        System.out.println("[음료수 자판기 관리 시스템]");
        System.out.println("=========================");
        System.out.println("1. 전체 음료수 및 잔액 보기");
        System.out.println("2. 주스 구입하기 ( 200원 )");
        System.out.println("3. 커피 구입하기 ( 100원 )");
        System.out.println("4. 콜라 구입하기 ( 50원 )");
        System.out.println("5. 구입한 음료수 목록 보기");
        System.out.println("9. 종료");

        System.out.println();
        System.out.println("=========================");
    }
    public static void main(String[] agrs) {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        Drink[] drinkList = {new Coffee(), new Juice(), new Coke()};

        VendingMachineBiz vendingMachine = new VendingMachineBiz();

        while(true) {
            printMenu();
            System.out.print("메뉴 입력 => ");
            input = Integer.parseInt(sc.nextLine());

            if(!(input >= 1 && input<=5 || input==9)) {
                System.out.println("메뉴 값을 확인 후 다시 입력하세요.");
                continue;
            }

            switch(input) {
                case 1:
                    vendingMachine.printDrinkList(drinkList);
                    continue;
                    
                case 2:
                    vendingMachine.cartDrink(new Juice());
                    continue;

                case 3:
                    vendingMachine.cartDrink(new Coffee());
                    continue;

                case 4:
                    vendingMachine.cartDrink(new Coke());
                    continue;

                case 5:
                    vendingMachine.printCart();
                    continue;

                case 9:
                    System.out.println("프로그램 종료");
                    break;
            }
            break;
        }
    }
}
