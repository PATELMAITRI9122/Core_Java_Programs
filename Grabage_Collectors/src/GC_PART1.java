import java.util.Date;

import javax.xml.crypto.Data;

public class GC_PART1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r1 = Runtime.getRuntime();
		System.out.println(r1.totalMemory()); // 134217728
		System.out.println(r1.freeMemory()); // 132684680
		
	for(int i =0; i<100000; i++) {
			Date d = new Date();
			d = null;
		}
		
		System.out.println(r1.freeMemory()); //132684736
		r1.gc();
		System.out.println(r1.totalMemory()); //8388608
		

	}

}
