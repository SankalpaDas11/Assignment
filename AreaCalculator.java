package com.cognizant.shapes;
import java.util.Scanner;
public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the length: ");
				int length = sc.nextInt();
				System.out.print("Enter the breadth: ");
				int breadth = sc.nextInt();
				Rectangle obj = new Rectangle();
				obj.calculateArea(length, breadth);
	}

}
