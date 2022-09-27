//2. Write a Java program to create a new array list, add some colors (string) and print out the collection.
package Array;
import java.util.Scanner;
public class ArrayColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner class
		System.out.print("Please enter how many colours you want to add : "); // asking the array size
		int size = sc.nextInt(); // storing the array size
		String[] a = new String[size]; // creating a new array to store the string type elements
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th colour : " ); // asking for input strings
			a[i] = sc.next(); // storing the elements
		}
		System.out.println("Your collection of colours : "); 
		for(int i=0; i<size; i++) {
			System.out.print(a[i] + ", "); // printing the collection
		}
	}
}
