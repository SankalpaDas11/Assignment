// Q.4 Write a Java program to insert an element (specific position) into an array. 
package ArrayAssignment28th;
import java.util.Scanner;
public class InsertNewElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		double a[] = new double[size]; // creating a new array
		double b[] = new double[size+1];
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for the elements 
			a[i] = sc.nextDouble(); // storing the array element
		}
		System.out.println("Please enter the index position where you want to put the new element : "); // asking for the index
		int index = sc.nextInt(); // storing the index
		System.out.println("Enter the new element : "); // asking for the new element
		double newvalue = sc.nextDouble(); // storing the new element
		for(int i = 0; i < index; i++) {
			b[i]=a[i]; // storing the values of the array to the next array upto the specific index
		}
		b[index]=newvalue; // inserting the new value
		for(int i = index; i < size; i++) {
			b[i+1]=a[i]; // storing the remaining old elements
		}
		System.out.println("Your new array is : ");
		for(int i = 0; i <= size; i++) {
			System.out.print("|"+b[i]+"|"); // printing the new array
		}
	}
}
