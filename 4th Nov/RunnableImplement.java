package Thread;

class NewRunnable implements Runnable{
	public void run() {
		System.out.println("printing something");
	}
}
public class RunnableImplement {
public static void main(String[] args) {
	
	// creating 4 objects of 
	NewRunnable nr1= new NewRunnable ();
	NewRunnable nr2= new NewRunnable ();
	NewRunnable nr3= new NewRunnable ();
	NewRunnable nr4= new NewRunnable ();
	
	// creating 4 new threads with previous objects
	Thread t1=new Thread(nr1);
	Thread t2=new Thread(nr2);
	Thread t3=new Thread(nr3);
	Thread t4=new Thread(nr4);
	
	// starting the threads
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}