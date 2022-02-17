package tutorial_3;

public class manyMethodManyInstance {
	
	private String girlName;
	
	public manyMethodManyInstance(String name) {
		this.girlName = name;
	}
	
//	public void setName(String name) {
//		this.girlName = name;
//	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first gf was %s", getName());
	}
	
	

}
