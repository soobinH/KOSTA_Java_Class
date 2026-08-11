package Chapter7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i<10; i++) {
		
			if(i == 2 || i == 0 || i == 7) {
				cards[i] = new SutdaCard(i+1, true);
			}
			
			else {
				cards[i]= new SutdaCard(i+1, false);
			}
			
			cards[i+10] = new SutdaCard(i+1, false);
		}
	}
	
	
	
	class SutdaCard {
		final int num;
		final boolean isKwang;
		
		SutdaCard() {
			this(1,true);
		}
		
		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}
		
		public String toString() {
			return num+(isKwang ? "K": "");
		}
	}
	
	void shuffle() {
		for(int i = 0; i<10; i++) {
			int random = (int)(Math.random() *20);
			SutdaCard tmp = cards[i];
			cards[random] = cards[i];
			cards[i] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*20);
		return cards[index];
	}
}

public class Ex1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
		System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
