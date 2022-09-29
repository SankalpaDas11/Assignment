// Q.2 Write a Java program to remove a specific element  from an array. 
package ArrayAssignment28th;
import java.util.Scanner;
public class RemoveElement {

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
		System.out.println("Your array is : ");
		for(double i : a) {
			System.out.print("|" + i + "|"); // printing the array
		}
		System.out.println("\nPlease enter the element you want to remove : "); // asking for element to remove
		double remove = sc.nextDouble(); 
		for(int j = 0; j< size; j++) {
			if(a[j]==remove) { // checking the location of the elemnet
				int k;
				for( k=j ; k<size-1;k++) {
					a[k]=a[k+1]; // removing logic
				}
			}
		}
		System.out.println("Your new array is : ");
		for(int l = 0; l < size - 1; l++) {
			System.out.print("|" + a[l] + "|"); // printing the new array
		}
	}
}
