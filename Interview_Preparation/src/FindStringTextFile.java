import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class FindStringTextFile {
	
	public static void main(String[] args) {
		
		//shuffle an array
		
		int[] array = {1,2,3,4,5,6,7};
		
		Random ran = new Random();
		
		for(int i =0; i<array.length; i++) {
			
			int randomIndex = ran.nextInt();
			//System.out.println(randomIndex);
			
			int temp = array[randomIndex];
			
			array[randomIndex] = array[i];
			
			array[i] = temp;
			
			
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	

}
