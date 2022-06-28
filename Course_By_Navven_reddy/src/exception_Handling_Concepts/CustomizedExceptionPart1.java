package exception_Handling_Concepts;

public class CustomizedExceptionPart1 extends RuntimeException {

	public static void main(String[] args) throws ToYoung {

		int age = Integer.parseInt(args[0]);

		if (age > 60)
			throw new ToOld("Too Old");
		else if (age < 18)
			throw new ToYoung("Too Young");
		else
			System.out.println("You get match detail by mail");

	}

}

/*
 * This below 2 class known as a customized exception
 */

class ToYoung extends Exception {

	public ToYoung(String msg) {
		super(msg);
	}

}

class ToOld extends RuntimeException {

	public ToOld(String msg) {
		super(msg);
	}
}
