package tutorial_3;

public class StaticExample {
	
	private String first;
	private String last;
	private static int members  = 0;
	// Static means only one refrence is created and accessible via anywhere in the class and outside class as well
	//all the object shared same variable 
	// Static vale remain same for all the object wheter it's first time calling or last time
	
	public StaticExample(String first, String last) {
		this.first = first;
		this.last = last;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
		//System.out.println(members);
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public static int getMembers() {
		return members;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExample member1 = new StaticExample("Maitri", "Patel");
		StaticExample member2 = new StaticExample("Brijesh", "Vankawala");
		StaticExample member3 = new StaticExample("Harsh", "Patel");
		
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		
		

	}

}
