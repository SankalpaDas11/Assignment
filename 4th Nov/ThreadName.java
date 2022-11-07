package Thread;

class NewThread {
	public void name(String name) { // method to print the name
		try {
			Thread.sleep(2000); // to delay 2 secs 
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(name); // printing name
	}
}
class Thread100 extends Thread{
	NewThread nt; // object of NewThread class
	Thread100(NewThread nt){
		this.nt=nt;
	}
	public void run() {
		Thread obj = new Thread("Sankalpa");  // assigning the thread name
		obj.start();  
		String str = obj.getName(); //  getting the thread name in the string type variable str 
		nt.name(str);; // passing str to name method
	}
}
public class ThreadName { // class with main method
	public static void main(String[] args) {
		NewThread obj = new NewThread(); // object of NewThread method
		Thread100 t100 = new Thread100(obj); //new thread object passing the obj 
		t100.start(); //starting thread
	}
}
