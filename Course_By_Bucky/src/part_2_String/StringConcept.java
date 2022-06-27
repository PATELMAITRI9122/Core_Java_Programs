package part_2_String;

public class StringConcept {

	public static void main(String[] args) {
		
		String[] word = {"Sunday", "Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};
		
		String s = "maitripatelkrishna";
		String s1 = "Hello ";
		
		for(String w : word) {
			if(w.startsWith("S")) {
				System.out.println(w + " starts with S");
			}
		}
		
		for(String w: word) {
			if (w.endsWith("y")) {
				//System.out.println(w + "end with W");
			}
		}
		
		System.out.println(s.indexOf('a',8));
		System.out.println(s.indexOf("kri"));
		
		System.out.println(s1.concat(s));
		System.out.println(s.replace("krishna", "maitri"));
		System.out.println(s.toUpperCase());
		System.out.println(s1.trim().concat(s1));

	}

}
