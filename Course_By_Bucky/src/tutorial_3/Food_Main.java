package tutorial_3;

import java.util.Iterator;

public class Food_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Food_Poly object[] = new Food_Poly[3];
//		object[0] = new Junk_Poly();
//		object[1] = new Traditional_Food();
//		object[2] = new Food_Poly();
//		
//		for(int i = 0; i<3; ++i) {
//			object[i].eat();
//		}
		
		Food_Pasta object = new Food_Pasta();
		//Food_Poly object2 = new Food_Poly();
		
	//	object.digest(object2);
		
		Food_Poly object3 = new Junk_Poly();
		Food_Poly object4 = new Traditional_Food();
		
		object.digest(object4);
		object.digest(object3);


		
		
		
 
	}

}
