package tutorial_3;

public class AnimalList {
	
	private Animal theList[] = new Animal[5];
	private int count = 0;
	
	public void add(Animal a) {
		
		if (count<theList.length) {
			theList[count] = a;
			System.out.println("Animal is listed at index: " + count);
			count++;
		}
	}

	

}
