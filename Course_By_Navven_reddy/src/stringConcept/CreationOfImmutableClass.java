package stringConcept;

public final class CreationOfImmutableClass {

	private int i;
	
	CreationOfImmutableClass(int i){
		this.i = i;
	}
	
	public CreationOfImmutableClass modify(int i) {
		if(this.i == i)
			return this;
		else
			return new CreationOfImmutableClass(i);
		
	}
	
	
	public static void main(String[] args) {
		CreationOfImmutableClass c = new CreationOfImmutableClass(10);
		CreationOfImmutableClass c1 = c.modify(10); //true
		CreationOfImmutableClass c2 = c.modify(100); //false
		
		System.out.println(c==c1);
		System.out.println(c==c2);
		
		final StringBuffer sb = new StringBuffer("AAA"); // by declaring final we are not getting immutable object
		sb.append("BB"); //final means we can't reassign 
		System.out.println(sb);
		
		//sb = new StringBuffer("RAVI");

	}

}
