package com.test02;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>(); 

        //Student 객체를 3개 생성하여 List에 저장한다.
        
        Student st1 = new Student("홍길동", 20, 177, 74, "201301", "체육");
        Student st2 = new Student("이순신", 44, 178, 77, "201302", "체육");
        Student st3 = new Student("유관순", 18, 155, 45, "201303", "컴퓨터");

        list.add(st1);
        list.add(st2);
        list.add(st3);

        // List에 저장된 Student 객체 정보를 출력한다.

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
