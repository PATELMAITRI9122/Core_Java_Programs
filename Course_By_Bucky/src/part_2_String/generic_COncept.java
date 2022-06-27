package part_2_String;

public class generic_COncept {

	public static void main(String[] args) {
		
		Integer[] inte = {1,2,3,4};
		Character[] chare = {'A','C','k'};
		
		printMe(inte);
		printMe(chare);

	}

	private static void printMe(Integer[] inte) {
		for(Integer i: inte)
			System.out.printf("%s",inte);
		System.out.println();
		
	}
	
	private static void printMe(Character[] chare) {
		for(Character i: chare)
			System.out.printf("%s",chare);
		System.out.println();
		
	}

}
