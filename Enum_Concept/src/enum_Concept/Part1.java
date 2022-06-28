package enum_Concept;

enum Beer {
	KF, KO, RC;

}

public class Part1 {

	public static void main(String[] args) {

		Beer b = Beer.KF;
		// System.out.println(b);
		b = Beer.KO;
		
		Beer[] b1 = Beer.values();
		
		for(Beer b2: b1) {
			System.out.println(b2 + "...." + b2.ordinal());
		}

		switch (b) {
		case KF: {
			System.out.println("It's children's brand");
			break;
		}
		case KO:
			System.out.println("It's too high");
			break;
		case RC:
			System.out.println("it's not that much kick");
			break;
//		case xxx:
//			System.out.println("it's not that much kick");
//			break;
		default:
			System.out.println("What's Your Brand");
		}

	}

}
