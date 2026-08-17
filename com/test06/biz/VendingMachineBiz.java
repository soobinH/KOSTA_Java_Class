package com.test06.biz;

import java.util.Arrays;

import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineBiz implements IVendingMachineBiz{
    private int balance = 1000;
    private Drink[] cartList = new Drink[3];
    private int count = 0;
    

    public void cartDrink(Drink drink) {
        // 3) 잔액과 구매가격을 비교하여 부족한 경우에 에러 메시지를 출력한다. 
        if(balance<drink.getPrice()) {
            System.out.println(String.format("잔액이 부족하여 %s을/를 구매할 수 없습니다.", drink.toString()));
            return;
        }

        // 4) 현재 갖고 있는 잔액에서 구매가격만큼 뺀다. 
        balance -= drink.getPrice();

        

        System.out.print(drink.toString() + "를 구매했습니다. ");
        System.out.println("현재 잔액: " + balance + " 원\n");


        // 5) 배열에 저장된 개수와 배열의 크기가 같으면, 기존의 배열보다 사이즈가 3배인 배열을 생성한 후, 
        // 기존의 배열 내용을 새로운 배열에 복사하고 새로운 배열과 기존 배열을 바꾼다. 
        if (cartList.length == count) {
            cartList = Arrays.copyOf(cartList, cartList.length * 3);
        }

        // 6) 배열에 구매한 개수만큼 저장하고 count값을 증가시킨다.
        cartList[count++] = drink;
        
    }
    public void printCart() {
        // 1) 배열에 저장된 데이터 타입에 따른 개수를 count한다.
        int coffeeCnt = 0;
        int juiceCnt = 0;
        int cokeCnt = 0;

        for(int i = 0; i<count; i++) {
            if(cartList[i] instanceof Coffee) {
                coffeeCnt++;
            }

            else if(cartList[i] instanceof Juice ) {
                juiceCnt++;
            }

            else if(cartList[i] instanceof Coke) {
                cokeCnt++;
            }
        }

        // 2) 배열에 저장된 총 구매금액을 계산한다. 
        int total = 0;
        total += (coffeeCnt*100 + juiceCnt*200 + cokeCnt*50);

        // 3) 구매목록과 남은 잔액을 출력한다.( 실행결과 참조 ) 
        System.out.println("====== 음료 구입 목록 ======");
        System.out.println("주스: " + juiceCnt + " 개");
        System.out.println("커피: " + coffeeCnt + " 개");
        System.out.println("콜라: " + cokeCnt + " 개");
        System.out.println("===========================");
        System.out.println("사용 금액: " + total);
        System.out.println("남은 금액: " + balance);
    }

    public void printDrinkList(Drink[] drinkList){
        System.out.println("==============================");
        System.out.println(String.format("%10s \t %10s", "음료수명", "가격"));
        System.out.println("==============================");

       
        for(int i = 0; i<drinkList.length; i++) {
            System.out.println(String.format("%10s \t %10s", drinkList[i].toString(), drinkList[i].getPrice()));
        }
        System.out.println("현재 잔액: " + balance + " 원\n");
    };
    
}
