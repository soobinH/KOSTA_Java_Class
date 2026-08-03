
public class ArrayEx1 {

	public static void main(String[] args) {
		int n = 10;
		int m;
		m = 20;
		
		
		int[] arr1 = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		int[] arr2 = new int[] {1, 2, 3}; // 배열의 선언과 초기화를 동시에 할 때에는 배열의 크기를 지정하지 않는다.
		int[] arr3 = {1, 2, 3}; // 위의 것과 메모리 구조 동일, 완전히 동일하지만 코드만 생략한 것이다.
		
		int[] arr4 = new int[3];
//		arr4 = {1, 2, 3}; // error 이건 안 됨 값 초기화는 선언 및 초기화를 한 번에 할 때에만 가능함
		
		int [] arr5;
		arr5 = new int[] {1, 2, 3}; // 이건 됨 그냥 한 줄에 쓰기만 하면 초기화 되는 거임
	}

}
