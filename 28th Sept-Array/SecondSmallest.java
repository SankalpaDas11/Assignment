// Q.6 Write a Java program to find the second smallest element in an array. 
package ArrayAssignment28th;
import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		int a[] = new int[size]; // creating a new array
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for the elements 
			a[i] = sc.nextInt(); // storing the array element
		}
		Arrays.sort(a); // sorting the array in ascending order
		System.out.println(a[1]); // printing the second element of the sorted array
	}
}
