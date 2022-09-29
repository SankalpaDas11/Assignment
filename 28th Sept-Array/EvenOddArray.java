// Q.8 Write a Java program to find the number of even and odd integers in a given array of integers.
package ArrayAssignment28th;
import java.util.Scanner;
public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		int a[] = new int[size]; // creating a new int type array
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for the elements 
			a[i] = sc.nextInt(); // storing the array element
		}
		System.out.println("Even numbers in your array are : ");
		for(int j = 0; j<size; j++) {
			if(a[j]%2==0) { // checking if the number is even
				System.out.print("-"+a[j]+"-"); // printing the even numbers
			}
		}
		System.out.println("Odd numbers in your array are : ");
		for(int j = 0; j<size; j++) {
			if(a[j]%2!=0) { // checking if the number is odd
				System.out.print("-"+a[j]+"-"); //printing the odd numbers
			}
		}
	}
}