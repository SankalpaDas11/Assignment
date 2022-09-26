// We have made a program to make your puja planning...
// We have implemented Scanner class and nested switch case statements:
// members : Sankalpa Das, Avijit Dey, Rohit Maity, Bidisha Sahoo, Nilanjan Mondal...
import java.util.Scanner; 
public class DurgaPuja {
	public static void main(String[] args) {
		System.out.println("********** \nWe are providing puja plans \n********** \n");
		Scanner Sc = new Scanner(System.in); //scanner class
		System.out.print("Please enter your direction \n 1. North \n 2. East \n 3. South: "); // asking for diraction 
		String a = Sc.next(); // Storing direction
		switch(a) {
		// case statement
		case "North":System.out.println("**So you want to visit North Kolkata puja pandals**");
				System.out.println("Please input your purpose: \n 1. Press a for pandal hopping \n 2. Press b for photosession or restaurant : ");
				String opt1 = Sc.next();
				switch(opt1) {
					case "a": System.out.println("***** \nMust visit :Bagbazar, Kumortuli, Ahiritola Sarbojonin. \n*****");
					break;
					case "b": System.out.println("----- \nBagbazar Ghat is the best place for photosession \n-----");
					default: System.out.println("You are too exited, please provide correct option.");
					break;}
		break;
		case "East":System.out.println("**So you want to visit East Kolkata puja pandals**");
					System.out.println("Please input your purpose: \n 1. Press a for pandal hopping \n 2. Press b for photosession or restaurant : ");
					String opt2 = Sc.next();
					switch(opt2) {
						case "a": System.out.println("***** \n you can visit these : Sribhumi sporting, Lake Town Adhibasi Brinda \n*****");
						break;
						case "b": System.out.println("----- \nCC2 and mani square mall is the best place for photoshoot \n-----");
						break;
						default: System.out.println("You are too exited, please provide correct option.");}
		break;
		case "South":System.out.println("**So you want to visit South Kolkata puja pandals**");
					System.out.println("Please input your purpose: \n 1. Press a for pandal hopping \n 2. Press b for photosession or restaurant : ");
					String opt3 = Sc.next();
					switch(opt3) {
						case "a": System.out.println("***** \nWell known pandals : Deshapriya park, Suruchi sangha, Chetla Agrani \n***** ");
						break;
						case "b": System.out.println("---- \nSouth city and lake mall is the best place for fooding & photoshoot \n-----");
						break;
						default: System.out.println("You are too exited, please provide correct option.");}
		break;
		// default statement
		default: System.out.println("You are too lazy to choose... :( ");
}}}