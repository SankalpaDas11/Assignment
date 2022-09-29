// Q.3  Write a Java program to copy an array by iterating the array. 
package ArrayAssignment28th;
import java.util.Scanner;
public class CopyAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring a source array
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		String a[] = new String[size]; // creating a new array
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for the elements 
			a[i] = sc.next(); // storing the array element
		}
		String[]b = new String[size]; // creating a new array
		System.arraycopy(a, 0, b, 0, size); // copying array a to b
		System.out.println("Your new array is : ");
		for(int l = 0; l < size ; l++) {
			System.out.print("."+b[l]+"."); // printing the new array
		}
		
	}
}
