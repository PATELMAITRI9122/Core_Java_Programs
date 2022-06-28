
public class SwitchStatementDemo {
	
	int choice = 2;
	
	int x = switch (choice) {
	case 1,2,3: {
		
		yield choice;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + choice);
	};
	
	String textBlocl = """
			Hi
			Hello
			Yes
			""";
	
	
	public static void main(String[] args) {
		
	}

}
