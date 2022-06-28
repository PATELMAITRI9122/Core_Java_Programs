package JavaBasics;

public class DataTypes {
	
	public static void main(String[] args) {
		
	int x[][] = new int[2][3];
	
	x[0][0] = 10;
	x[0][1] = 20;
	x[0][2] = 30;
	
	x[1][0] = 40;
	x[1][1] = 50;
	x[1][2] = 60;
	
	System.out.println(x.length); // no of row
	System.out.println(x[1].length); // no. of column
	
	for(int row = 0; row<x.length; row++) {
		for(int column = 0; column<x[row].length; column++) {
			System.out.println(x[row][column]);
		}
	}
	
	
		
	}

}
