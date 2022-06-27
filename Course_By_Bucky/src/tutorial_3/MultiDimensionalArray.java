package tutorial_3;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstElemetArray[][] = {{8,9,10},{7,8,9}}; // declaration and initialiation of multidimensional Array
		int secondElementArray[][] = {{10,20,30},{43},{40,50,60}};

		System.out.println("The First Element of Array Table");
		display(firstElemetArray);
		
		System.out.println("The Second Element of Array Table");
		display(secondElementArray);
		
		
	}
	
	public static void display(int x[][]) {
		
		for(int row = 0; row < x.length; row++) {
			for(int coulmn = 0;coulmn< x[row].length;coulmn++) {
				System.out.print(x[row][coulmn] + "\t");
			}
			System.out.println();
		}
		
	}

}
