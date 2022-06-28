import java.util.List;

public class OverLoadingAndOverridingConcept extends Base {
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
	public static void main(String[] args) {
		
		Runnable r = () -> System.out.println("Runnable Method");
		
		III i = (a,b) -> System.out.println("The sum is: " + (a+b)); 
		i.add(10, 20);
		
		
	}

}

interface III{
	public void add(int a, int b);
}

class Base{
	public void print() {
		System.out.println("First - No Arg Method");
	}
	
	public void run(int n) {
		System.out.println("Second - arg Method");
	}
}
