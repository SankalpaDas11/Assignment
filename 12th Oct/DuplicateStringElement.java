//Q.1 Java program to find duplicate elements in an String array.
package String;

public class DuplicateStringElement {

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		String s1 = "City Kolkata"; // initializing a new string 
		System.out.println(s1); // printing the string
		int x=s1.length(); // storing the length of the string
		char [] arr = new char[s1.length()];
		for(int i = 0 ; i <s1.length() ; i++) {
			arr[i] = s1.charAt(i); // storing the elements
		}
		for(int i=0;i<x;i+=1) {
			for(int j = i+1; j< x; j++) {
				if(arr[j]==arr[i]) { // comparing elements
				System.out.println("The duplicate element : " + arr[j]); // printing the duplicate
				}
			}
		}
	}
}