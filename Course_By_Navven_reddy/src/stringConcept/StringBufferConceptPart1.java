package stringConcept;

public class StringBufferConceptPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //16
		
		sb.append("abcdegfhijklmnopqrstuvwxyz");
		
		System.out.println(sb.capacity()); //34

		StringBuffer sb1 = new StringBuffer(1000);
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("Durga");
		System.out.println(sb2.capacity());
		System.out.println(sb2.charAt(3));
	//	System.out.println(sb2.charAt(30));
		sb2.setCharAt(3, 'f');
		System.out.println(sb2);
		sb2.append("HELLO");
		System.out.println(sb2);
		sb2.append(99);
		System.out.println(sb2);
		sb2.insert(3, "DD");
		System.out.println(sb2);
		sb2.insert(3, 10.5);
		System.out.println(sb2);
		
		sb2.delete(3, 9);
		System.out.println(sb2);
		sb2.deleteCharAt(3);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
		sb2.setLength(4);
		System.out.println(sb2);
		
		sb2.ensureCapacity(10010);
		System.out.println(sb2.capacity());
		
		sb2.append("AAA");
		System.out.println(sb2.capacity());
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		
	}

}
