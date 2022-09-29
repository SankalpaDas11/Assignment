// Q.5 Write a Java program to find the maximum and minimum value of an array. 
package ArrayAssignment28th;
import java.util.Arrays;
import java.util.Scanner;
public class MaximumMinimumArray {

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
		Arrays.sort(a); // sorting the array in ascending order
		System.out.println("Your maximum element is : " + a[size-1]); // printing the maximum element
		System.out.println("Your minimum element is : " + a[0]); // printing the minimum element
	}
}
