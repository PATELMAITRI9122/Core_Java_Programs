package generic_Collections;

public class ArrGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gen<String> g = new gen<String>("ABC");
		g.show();
		System.out.println(g.getob());
		
		

	}

}

class gen<T>{
	
	T ob;
	public gen(T ob) {
		// TODO Auto-generated constructor stub
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("TYpe: " + ob.getClass().getName());
	}
	
	public T getob() {
		return ob;
	}
}
