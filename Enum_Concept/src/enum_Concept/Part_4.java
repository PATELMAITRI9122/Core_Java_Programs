package enum_Concept;

enum Beer2{
	
	KF(100),KO(75),RC(74),FO;
	
	int price;
	private Beer2(int price) {
		this.price = price;
	}
	
	private Beer2() {
		this.price = 65;
	}
	
	public int getPrice() {
		return price;
	}
}

public class Part_4 {

	public static void main(String[] args) {
		
		Beer2[] b = Beer2.values();
		for(Beer2 b1 : b) {
			System.out.println(b1 + "......" + b1.getPrice());
		}

	}

}
