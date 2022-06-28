package multiThreading_Concept;

public class ThreadConceptPart3 {

	public static void main(String[] args) {
		
		tt t = new tt();
		t.start(); // This will Thread class -> start method -> which has an empty implementation 
	}

}

class tt extends Thread{
	
}
