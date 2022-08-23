// WAJP to solve quadratic equations
import java.util.Scanner;
public class Quadratic {
	public static void main(String[] Strings)   
	{  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the value of a: ");  // asking the input of coefficient of x square
	double a = sc.nextDouble();  
	System.out.print("Enter the value of b: ");  // asking the input of coefficient of x
	double b = sc.nextDouble();  
	System.out.print("Enter the value of c: ");  // asking the constant input
	double c = sc.nextDouble();  
	double d= b * b - 4.0 * a * c;  
	if (d> 0.0)   // checking if the equation has real and unequal roots
	{  
	double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
	double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
	System.out.println("The roots are " + r1 + " and " + r2);  
	}   
	else if (d == 0.0)   // checking for equal roots
	{  
	double r1 = -b / (2.0 * a);  
	System.out.println("The equal roots are " + r1);  
	}   
	else   
	{  
	System.out.println("Roots are not real.");  
	}  
	}  
}
