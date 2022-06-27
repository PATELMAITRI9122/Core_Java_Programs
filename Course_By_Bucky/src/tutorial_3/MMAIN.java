package tutorial_3;

public class MMAIN {
	
	public static void main(String[] args) {
		
//		DogList object = new DogList();
//		Dog object2 = new Dog();
//		object.add(object2);
//		object.add(object2);
		
//		AnimalList object = new AnimalList();
//		Dog Do = new Dog();
//		Fish Fo = new Fish();
//		object.add(Do);
//		object.add(Fo);
		//	Animal object2 = new Animal();
		
		Animal[] theList = new Animal[2];
		Dog d = new Dog();
		Fish f = new Fish();
		
		theList[0] = d;
		theList[1] = f;
		
		for(Animal a : theList) {
			a.noise();
		}
		
		
		
	}

}
