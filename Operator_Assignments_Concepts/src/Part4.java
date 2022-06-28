
public class Part4 {

	public static void main(String[] args) {
		
		int x = 10, y = 15;
		if(++ x < 10 & ++y>15) {
			x++;
		}else
			y++;
		System.out.println(x + " " + y);
		
		System.out.println("****");

		if(++ x < 10 && ++y>15) {
			x++;
		}else
			y++;
		System.out.println(x + " " + y);
		
		int x1 = 150;
		byte b = (byte)x1;
		System.out.println(b);
		short s = (short)x1;
		System.out.println(s);
		
		//int a=b=c=d=20;
		
		int a,e,c;
		int r=a=e=c=20;
	}

}
