import java.util.StringTokenizer;

public class RegexDemo6 {
	
	public static void main(String[] args) {
		
		//StringTokenizer st = new StringTokenizer("Durga Software Solutions");
		StringTokenizer st = new StringTokenizer("27-06-2022","-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
