package revision_concept;

public class Check_Prime_Number {

	public static void main(String[] args) {
		
		System.out.println(checkPrimeNumber(10));
		System.out.println(checkPrimeNumber(13));

	}
	
	public static boolean checkPrimeNumber(int n) {
		
		if(n == 0 || n == 1)
			return false;
		if(n == 2)
			return true;
		
		for(int i = 2; i<=n/2; i++){
			if(n%i == 0)
				return false;
		}
		
		return true;
		
	}

}
