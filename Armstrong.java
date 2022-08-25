// Write a java program to find whether a given number is Armstrong number or not.
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner class
		Scanner input =  new Scanner(System.in);
		// take input from user
		System.out.print("Enter any positive integer number to check whether it is armstrong or not: ");
		int num = input.nextInt(); // storing the input value
		int count = 0;
		int check = num;
		while (check != 0) { // starting while to count the digits in the input number
			check /= 10;
			++count; }
		int dummy = num; int remainder; int result = 0;
		while (dummy != 0 )
        {
            remainder = dummy % 10; // breaking in separate digits
            result += Math.pow(remainder, count); // logic
            dummy /= 10;
        } if(result == num) {
            System.out.println(num + " is an Armstrong number."); }
        else {
            System.out.println(num + " is not an Armstrong number."); }}}