package tutorial_3;

import java.util.EnumSet;

public class apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello From Tutorial 3");
		
//		refrencedObject object = new refrencedObject(4, 5, 6);
//		composition object2 = new composition("Maitri", object);
//		
//		System.out.println(object2);
		
//		for(Enumeration data: Enumeration.values()) {
//			System.out.printf("%s\t%s\t%s\n", data, data.getDesc(),data.getBirthday());
//		}
//		
//		System.out.println("\n Now for the range of the constants!!! \n");
//		
//		 for(Enumeration data : EnumSet.range(Enumeration.Maitri, Enumeration.Brijesh)) {
//			 System.out.printf("%s\t%s\t%s\n", data, data.getDesc(),data.getBirthday());
//		 }
		
		InheritanceExampleCommon object = new InheritanceExampleCommon();
		InheritanceExample2 object2 = new InheritanceExample2();
		
		object.detail();
		object2.detail();
		
		

	}

}
