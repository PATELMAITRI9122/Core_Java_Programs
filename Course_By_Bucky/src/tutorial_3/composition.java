package tutorial_3;

public class composition {
	
	private String name;
	private refrencedObject birthday;
	
	public composition(String theName, refrencedObject theDate) {
		// TODO Auto-generated constructor stub\
		this.name = theName;
		this.birthday = theDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("My name is %s and my birthday is %s", name, birthday);
	}

}
