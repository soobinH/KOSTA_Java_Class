package Chapter9;

public class EX12 {

	public static int getRand(int from,int to) {
		if(from>to) {
			int tfrom = from;
			from = to;
			to = tfrom;
		}
		return (int)(Math.random() * (to-from+1)) + from;
	}
	
	public static void main(String[] args)
	{
		for(int i=0; i< 20; i++)
		System.out.print(getRand(1,-3)+",");
	}

}
