import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NullPointerExceptionConcept {
	
	public static void main(String[] args) {
		String str = null;
		String str1 = "AbC";
		
	//	System.out.println(str.equals(str1));
		
		try {
			FileInputStream fio = new FileInputStream("test.txt");
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
