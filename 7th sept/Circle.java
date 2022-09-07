package com.innovation.shapes;
import java.util.Scanner;
public class Circle {
	private float radius;
	static float pi;
	// default cons (cons - 1)
	public Circle () {
		radius = 1.5f;
	}
	// cons - 2
	public Circle (float radius) {
		this(2.5f, 3.14f);
		this.radius=radius;
		System.out.println("hello");
	}
	// cons - 3
	public Circle(float radius, float pi) {
		this.radius = radius;
		this.pi = 3.5f;
		System.out.println("completed");
	}
	void calculateCircleArea(float radius, float pi) {
		System.out.println("The Area is : " + (pi * radius * radius));
	}
	void calculateCircusference(float radius, float pi) {
		System.out.println("The Perimeter is : " + (2 * pi * radius));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		float radius = sc.nextFloat();
		Circle Area = new Circle(radius, pi);
		Circle Perimeter = new Circle(radius, pi);
		Area.calculateCircleArea(radius, pi);
		Perimeter.calculateCircusference(radius, pi);
	}}
