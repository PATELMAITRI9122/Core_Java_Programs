package enum_Concept;

enum Beer1{
	
	KF, KC, RC;
	
	private Beer1() {
		System.out.println("Constructor-ENUM");
	}
}


public class Part_3 {

	public static void main(String[] args) {
		
		//Beer1 b1 = new Beer1();
		// Can not create enum object directly/explicitly -> automatic enum object load when constanct is being called
		Beer1 b = Beer1.KF;
		
		System.out.println("Main-Method");
		
		

	}

}
