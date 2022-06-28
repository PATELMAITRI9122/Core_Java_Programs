
public class AnonymousInnerClassVSLambdaExpression {

	public static void main(String[] args) {
		
		Interr i = new Interr() {
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("M2 Method");
				
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("M1 Method");
			}
		};
		
	}
	
}

interface Interr{
	public void m1();
	public void m2();
}
