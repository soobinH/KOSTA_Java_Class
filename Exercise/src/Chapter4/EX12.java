package Chapter4;
//  구구단의 일부분을 다음과 같이 출력하시오
// [실행결과]
// 2*1=2   3*1=3   4*1=4
// 2*2=4   3*2=6   4*2=8
// 2*3=6   3*3=9   4*3=12

// 5*1=5   6*1=6   7*1=7
// 5*2=10  6*2=12  7*2=14
// 5*3=15  6*3=18  7*3=21

// 8*1=8   9*1=9
// 8*2=16  9*2=18
// 8*3=24  9*3=27

public class EX12 {
    public static void main(String[] args) {
        int j = 2;
        int first_num = 2;
        
        for(int i = 1; j<10; i++) {
            i = i%3;
            if(i == 0) i = 3;
            for(j = first_num; j<first_num+3; j++ ) {
                if(j >= 10) {
                    j = first_num;
                    break;
                }
                System.out.print(String.format("%d*%d=%d\t", j, i, j*i));
            }
            if(j >= 10) continue;
            System.out.println();
            if(i == 3) {
                first_num += i;
                System.out.println();
            }


        }
    }
}
