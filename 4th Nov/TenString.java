package Thread;

import java.util.ArrayList; 				 //importing arraylist

class ToPrint { 
	public void name(ArrayList name) { 		 // method to print the arraylist
		for(int i = 0; i<name.size();i++)
			System.out.println(name.get(i)); //printing the arraylist by a for loop
	}
}
class SetArrayList extends Thread{
	ToPrint tp; 					//object of ToPrint class
	SetArrayList(ToPrint tp){
		this.tp=tp;
	}
	public void run() { 				// method to assign values into the arraylist
		ArrayList<String>Ten=new ArrayList<String>();
		Ten.add("India");
        Ten.add("Pakistan");
        Ten.add("Srilanka");
        Ten.add("USA");
        Ten.add("Australia");
        Ten.add("Japan");
        Ten.add("Afganisthan");
        Ten.add("China");
        Ten.add("Nepal");
        Ten.add("Bhutan");
        tp.name(Ten);
	}
}
public class TenString { 				//class with main method
	public static void main(String[] args) {
		ToPrint tt = new ToPrint(); 		// object of ToPrint class
		SetArrayList sl = new SetArrayList(tt); //object of setarraylist class
		sl.start();
	}
}
