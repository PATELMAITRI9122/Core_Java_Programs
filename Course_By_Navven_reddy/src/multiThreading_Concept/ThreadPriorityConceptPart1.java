package multiThreading_Concept;

public class ThreadPriorityConceptPart1 {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getPriority()); // main -> 5
		//Thread.currentThread().setPriority(15); //Illegal Argument Exception
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority()); // 9
		
		ww t = new ww(); // main thread -> create -> child thread
	//	System.out.println(t.currentThread().getPriority()); // main -> parent 
		System.out.println(t.getPriority()); //main -> parent
		

	}

}

class ww extends Thread{
	
}
