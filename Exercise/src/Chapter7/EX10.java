package Chapter7;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int prevChannel;
	private int volume;
	int cnt = 1;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL= 1;
	
	
	
	void setChannel(int channel) {
		this.channel = channel;
		if(cnt == 1) {
			prevChannel = this.channel;
			cnt++;
		}
		
	}
	
	void setVolume(int volume) {
		this.volume = volume;
	}
	
	int getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void gotoPrevChannel() {
		int tmp = channel;
		channel = prevChannel;
		prevChannel = tmp;
	}
	
	
}

public class EX10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());

	}

}
