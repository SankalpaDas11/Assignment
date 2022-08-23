import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the 1st integer: "); // asking to give 1st number from user
		int a = sc.nextInt();
		Scanner tc = new Scanner(System.in);
		System.out.println("Input the 2nd integer: "); // asking to give 2nd number from user
		int b = tc.nextInt();
		Scanner uc = new Scanner(System.in);
		System.out.println("Input the 3rd integer: "); // asking to give 3rd number from user
		int c = uc.nextInt();
		System.out.println("So the given numbers are : " + a + "," + b + ","+ c);
		if (a>b && a>c) {
			System.out.println("The greatest number is : " + a ); // checking and printing if 1st input is greatest
		} else if (b > a && b > c) {
			System.out.println("The greatest number is : " + b); // checking and printing if 2nd input is greatest
		} else {
			System.out.println("The greatest number is : " + c); // checking and printing if 3rd input is greatest
		}
	}

}