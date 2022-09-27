//3.Write a Java Program to reverse the array contents.
package Array;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		
		int a[] = new int[size]; // creating array to store the elements
		
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for elements
			a[i] = sc.nextInt(); // storing the elements
		}
		
		System.out.println("Your array in reverse order : "); 
		
		for(int i=size-1; i>=0; i--) {
			System.out.println(a[i]); // printing array in reverse order
		}
	}
}