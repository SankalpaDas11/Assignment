import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner class
		Scanner input =  new Scanner(System.in);
		// take input from user
		System.out.print("Enter the year to check whether it is a leap year or not: ");
		int year = input.nextInt(); // storing the input 
		if (year%100 == 0 && year%400 == 0) { //checking whether the year is a multiple of hundred 
			System.out.println("YES, " + year + " is a leap year");
		} else if (year%100 != 0 && year%4 == 0) {
			System.out.println("YES, " + year + " is a leap year");
		} else {
			System.out.println("No, " + year + " is not a leap year");
		}}}