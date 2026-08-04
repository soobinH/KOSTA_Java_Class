
public class ArrayCopyEx {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] cpy = arr;
		
		arr[0] = 100;
		System.out.println(cpy[0]); // 100 : cop는 arr와 같은 주소를 가지고 있기 때문
		
		
		// 배열의 복제
		int[] cpy2 = new int[arr.length];
		System.arraycopy(arr, 0, cpy2, 0, arr.length); // arr 배열의 0번째부터 arr 요소의 갯수만큼 cp2 배열의 0번째 요소에 복사한다.
		
		arr[0] = 200;
		System.out.println(cpy2[0]); // 100 
		
		int[] cpy3 = arr.clone(); // clone 함수는자신의 배열과동일한 배열을 생성하여 값을복사한 후 주소를 반납한다.
		arr[0] = 300;
		System.out.println(cpy3[0]); // 200: 메모리가 분리되어 즉, 복제되어 300이 아닌 원래의 값 200이 나온다.

	}

}
