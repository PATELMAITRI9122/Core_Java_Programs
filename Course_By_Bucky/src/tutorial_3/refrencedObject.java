package tutorial_3;

public class refrencedObject {
	
	private int month;
	private int day;
	private int year;
	
	public refrencedObject(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("The constructor: %s\n", this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month,day,year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toStringMethod object = new toStringMethod(4, 5, 2022);

	}

}
