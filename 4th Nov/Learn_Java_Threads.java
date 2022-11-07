package Thread;

class Learn {
	 void print(String num) {  // method to print the string part 
		System.out.println(num + " "); // printing the string parts
	}
}

class Thread10 extends Thread{
	Learn ln; //object of learn class
	Thread10(Learn ln){
		this.ln=ln;
	}
	public void run() { // 1st method to pass the string
		ln.print("I");; 
	}
}
class Thread20 extends Thread{
	Learn ln;
	Thread20(Learn ln){
		this.ln=ln;
	}
	public void run() {	// 2nd method to pass the string
		ln.print("want");; 
	}
}
class Thread30 extends Thread{
	Learn ln;
	Thread30(Learn ln){
		this.ln=ln;
	}
	public void run() {	// 3rd method to pass the string
		ln.print("to");; 
	}
}
class Thread40 extends Thread{
	Learn ln;
	Thread40(Learn ln){
		this.ln=ln;
	}
	public void run() {	// 4th method to pass the string
		ln.print("learn");; 
	}
}
class Thread50 extends Thread{
	Learn ln;
	Thread50(Learn ln){
		this.ln=ln;
	}
	public void run() {	// 5th method to pass the string
		ln.print("JAVA");; 
	}
}

public class Learn_Java_Threads {	// class with main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learn obj = new Learn(); // object of learn class
		
		//creating object and starting the strings 
		Thread10 t10 = new Thread10(obj);
		t10.start();
		Thread20 t20 = new Thread20(obj);
		t20.start();
		Thread30 t30 = new Thread30(obj);
		t30.start();
		Thread40 t40 = new Thread40(obj);
		t40.start();
		Thread50 t50 = new Thread50(obj);
		t50.start();
	}
}
