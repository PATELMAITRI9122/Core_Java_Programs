package tutorial_3;

public class DogList {
	
	private Dog[] theList = new Dog[5];
	
	private int i = 0;
	
	public void add(Dog d) {
		if(i<theList.length) {
			theList[i] = d;
			System.out.println("The dog is listed at index: " +i);
			i++;
		}
	}

}
