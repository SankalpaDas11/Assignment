//  WAJP to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;
public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any integer to check whether it is positive or nrgative : "); // asking to give a number from user
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("--The number is Positive, since " + a + " is greater than 0--"); // checking and printing whether the number is positive or not
		} else if (a < 0) {
			System.out.println("--The number is negative, since " + a + " is less than 0--"); // checking and printing whether the number is negative or not
		} else {
			System.out.println("--The given number is 0, So it is neither positive nor negative--"); //non positive-non negative
		}
	}

}
