// 1. Java Program to find average of an int Array.
package Array;
import java.util.Scanner;
public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		int a[] = new int[size]; // creating a new int type array
		double sum = 0;
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for the elements 
			a[i] = sc.nextInt();
			sum = sum + a[i]; // storing the total
		}
		System.out.println("Your array is : ");
		for(int i : a) {
			System.out.print("|" + i + "|"); // printing the array
		}
		System.out.println("\nYour array average is : " + (sum/size)); // printing the result of average
	}
}
