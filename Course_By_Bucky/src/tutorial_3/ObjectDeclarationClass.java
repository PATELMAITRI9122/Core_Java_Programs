package tutorial_3;

public class ObjectDeclarationClass {
	
	public static void main(String[] args) {
		
//		Time object = new Time(5,6,7);
//		System.out.println(object.toMilitary());
		
//		object.setTime(45, 120, 77);
//		System.out.println(object.toMilitary());
//		
//		object.setTime(45, 45, 45);
//		System.out.println(object.toMilitary());
		
	//	System.out.println(object.toString());
		
//		object.setTime(13, 120, 77);
//		//System.out.println(object.toMilitary());
//		System.out.println(object.toString());
		
		
	MultipleConstructor object = new MultipleConstructor();
	MultipleConstructor object2 = new MultipleConstructor(5);
	MultipleConstructor object3 = new MultipleConstructor(5,4);
	MultipleConstructor object4 = new MultipleConstructor(5,4,3);
	
	System.out.printf("%s\n",object.miliatary());
	System.out.printf("%s\n",object2.miliatary());
	System.out.printf("%s\n",object3.miliatary());
	System.out.printf("%s\n",object4.miliatary());
	
	
		
		
	}

}
