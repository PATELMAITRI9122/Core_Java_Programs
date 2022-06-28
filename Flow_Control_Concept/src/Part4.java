
public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		l1:{
			System.out.println("lll");
			if(x==5) {
				break l1;
			}
			System.out.println("kkkk");
		}
		
//		if(x==10) {
//			break;
//		}
//		System.out.println("kkkk");
		
		for(int i=0; i<10;i++) {
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		
		int a = 0;
		do {
			a++;
			System.out.println(a);
			if(++a < 5) {
				continue;
			}
			a++;
			System.out.println(a);
		}while(++a<10);
		
			

	}

}
