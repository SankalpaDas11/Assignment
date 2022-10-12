/* 
 2. Write a do-while loop that asks the user to enter two numbers. 
 The numbers should be added and the sum displayed. 
 The loop should ask the user whether he or she wishes to perform the operation again. 
 If so, the loop should repeat; otherwise it should terminate.
 */
 
import java.util.Scanner; 

public class SumAgain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // scanner class
     
        int num1, num2; // initializing two integers
        char choice; // initializing one character 
        
        do
        {
            System.out.print("Enter the first number : "); // asking 1st integer to add
            num1 = sc.nextInt(); // storing 1st input
          
            System.out.print("Enter the second number : "); // asking 2nd integer to add
            num2 = sc.nextInt(); // storing 2nd input
            
            int sum = num1 + num2; // adding two given integers
            System.out.println("Sum of numbers: " + sum); // printing result of addition
        
         // asking user if he/she want to repeat the operation
            System.out.print("Write yes or no if you want to continue or terminate :"); 
            choice = sc.next().charAt(0);
            
            
        }while(choice=='y'); // checking the users choice
    }  
}