package inside_anything_inside_concept;

public  interface Demo {
	
	public void getNumber();
	
	static interface Demo1{
		public void getName();
		
		static class Test1 implements Demo1, Demo{

			@Override
			public void  getName() {
				System.out.println("GetName - Method");
				
			}

			@Override
			public void getNumber() {
				System.out.println("GetNumber - Method");
				
			}
			
		}
	}

}
