// Q.7 Write a Java program to find the duplicate values of an array
package ArrayAssignment28th;
import java.util.Scanner;
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		double a[] = new double[size]; // creating a new array
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for the elements 
			a[i] = sc.nextDouble(); // storing the array element
		}
		for(int i = 0; i< size; i++) {
			for(int j = i+1; j< size; j++) {
				if(a[j]==a[i]) { // comparing elements
				System.out.println("The duplicate element : " + a[i]); // printing the duplicate
				}
			}
		}
	}
}


