package Chapter4;

// 우물의높이는 100m
// 달팽이가 하루에 이동하는 거리는 5
// 밤이 되면 잠을 자야 한다. 잘 때 2m씩 미끄러짐
// 달팽이가 우물을 빠져나오기 위해서는 며칠이 걸릴까?

public class SnailWellEx {

	public static void main(String[] args) {
		int forward = 5;
		int backward = 2;
		int total_length = 0;
		int date = 0;
		
		while(true) {
			date++;
			total_length += forward;
			if(total_length >= 100) break;
			total_length -= backward;
			
			System.out.println(String.format("%d일째: %dm/100m 이동 중", date, total_length));

		}
		
		System.out.println(date);

	}

}
