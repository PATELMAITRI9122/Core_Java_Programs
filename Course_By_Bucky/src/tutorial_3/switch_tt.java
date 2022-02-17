package tutorial_3;

public class switch_tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 5;
		
		switch (age) {
		case 1: System.out.println("AAAAA");
				break;
		case 2: System.out.println("BBBBB");
		        break;
		case 3: System.out.println("Finally you are true");
		        break;
		default:
			System.out.println("What's your age is?");
			//throw new IllegalArgumentException("Unexpected value: " + age);
		}

	}

}
