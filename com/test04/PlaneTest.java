package com.test04;

public class PlaneTest {

    public static void printPlaneInfo(Airplane air, Cargoplane car) {
        System.out.println("Plane FuelSize");
        System.out.println("================");
        System.out.println(String.format("%s \t %d", air.getPlaneName(), air.getFuelSize()));
        System.out.println(String.format("%s \t %d", car.getPlaneName(), car.getFuelSize()));
    }

    public static void main(String[] args) {
        
        // Airplane과 Cargoplane 객체생성
        Airplane air1 = new Airplane("L777", 1000);
        Cargoplane car1 = new Cargoplane("C50", 1000);

        // 생성된 객체의 정보 출력
        printPlaneInfo(air1, car1);

        // Airplane과 Cargoplane 객체에 100씩 운항
        System.out.println("100 운항 \n");
        air1.flight(100);
        car1.flight(100);

        // 운항후 객체의 변경된 정보 출력
        printPlaneInfo(air1, car1);

        // Airplane과 Cargoplane 객체에 200씩 주유
        System.out.println("200 주유 \n");
        air1.refuel(200);
        car1.refuel(200);

        // 주유후 객체의 변경된 정보 출력
        printPlaneInfo(air1, car1);
    }
    
}
