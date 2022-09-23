// Q. Write a java program to print the numbers divisible by 5 or 7 or both...
public class Multiple {
	public static void main(String[] args) {
		for (int i = 1; i <=200; i++ ) {
			if (i%5==0 && i%7!=0) { // checking if the number is divisible by 5
				System.out.println(i + " is divisible by 5"); 
			}
			else if (i%5!=0 && i%7==0) { // checking if the number is divisible by 7
				System.out.println(i + " is divisible by 7");
			}
			else if (i%5==0 && i%7==0) { // checking if the number is divisible by 5 and 7 both
				System.out.println(i + " is divisible by both 5 and 7");
			}
		}
	}
}
