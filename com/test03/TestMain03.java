package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {
    public static void main(String[] args) {
        String str = "1.22,4.12,5.93,8.71,9.34";

        //StringTokenizer 이용하여 List에 저장한다.
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        List<Double>list = new ArrayList<Double>();


        while(tokenizer.hasMoreTokens()) {
            list.add(Double.parseDouble(tokenizer.nextToken()));
        }

        //List에 저장된 데이터의 합과 평균을 구한다.
        double total = 0;
        double avg = 0;
        
        for(int i = 0; i<list.size(); i++) {
            total += list.get(i);
        }

        avg = (double)total/list.size();

        System.out.println(String.format("합 계: %.3f\n평 균: %.3f", total, avg));
    }
}
