package com.test05;

import java.util.HashMap;

public class Company {
    public static void main( String [] args ){
        HashMap<Integer, Employee> map = new HashMap<>();

        // 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다. 
        Secretary emp1 = new Secretary("홍길동", 1, "Secretary", 800);
        Sales emp2 = new Sales("이순신", 2, "Sales", 1200);
        
        // // HashMap에 저장시 키 값은 각 객체의 Number로 한다. 
        map.put(emp1.getNumber(), emp1);
        map.put(emp2.getNumber(), emp2);
        
        // // 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 ) 
        System.out.println(String.format("%10s \t %10s \t %10s", "name", "department", "salary"));
        System.out.println("==========================================================");
        for(Integer key: map.keySet()) {
            Employee value = map.get(key);
            System.out.println(String.format("%10s \t %10s \t %10d", value.getName(), value.getDepartment(), value.getSalary()));
        }
        
        // // 모든 객체의 인센티브 100씩 지급한다. 
        System.out.println("\n인센티브 100 지급\n");
        ((Secretary) map.get(1)).incentive(100);
        ((Sales) map.get(2)).incentive(100);

        // // 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
        System.out.println(String.format("%10s \t %10s \t %10s \t %10s", "name", "department", "salary", "tax"));
        System.out.println("===========================================================");
        for(Integer key: map.keySet()) {
            Employee value = map.get(key);
            System.out.println(String.format("%10s \t %10s \t %10d \t %10.2f", value.getName(), value.getDepartment(), value.getSalary(), value.tax()));
        }
    }
}
