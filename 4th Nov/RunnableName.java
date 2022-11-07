package Thread;

class NewThread2 implements Runnable{
	public void run() {
		Thread obj = new Thread("Sankalpa"); // assigning the thread name
		obj.start(); // starting the thread
		String str = obj.getName(); // getting the thread name in the string type variable str 
		System.out.println(str); // printing the thread name
	}
}


public class RunnableName { // class with main method
	public static void main(String[] args) { // main method
		NewThread2 obj = new NewThread2(); // object of NewThread2 class
		Thread t1 = new Thread(obj); //object of thread
		t1.start(); //starting thread
	}
}
