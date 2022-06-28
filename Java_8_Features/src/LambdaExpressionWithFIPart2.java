
public class LambdaExpressionWithFIPart2 {

	public static void main(String[] args) {
		
		/*
		 * Lambda Expression Implementation
		 */
		Interfce i = (a,b) -> System.out.println("The sum: " +(a+b));
		i.add(10, 20);
		i.add(100, 200);
		i.add(1000, 2000);
	}
}

interface Interfce{
	public void add(int a, int b);
}


/*
 * Normal Class Implementation
 * 
class demo1 implements Interfce{
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The sum of a and b is: " + (a+b));
		
		/*
		 * (int a, int b) -> syso("The sum of a nad b is: "(a+b));
		 */
//	}

