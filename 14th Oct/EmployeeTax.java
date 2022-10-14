//Sankalpa
/*Problem Statement 1: 
  Develop a class “TaxCalculator” inside a package “com.cognizant.tax”.
  The class should have an instance float variable named “basicSalary” and a boolean variable 
  named “citizenship”.*/

package com.cognizant.tax;                                                                      //Given package 
class TaxCalculator {																			//1st class to build given methods
	
	float basicSalary;																			//instance variables initializations 
	boolean citizenship;
	float tax;
	int nettSalary;
	
/*Problem Statement 2: 
  In the TaxCalculator class  create a method named  calculateTax()  
  that  should calculate and print the tax, the tax should  be calculated as follows
  tax = 30*basic salary/100
  The calculated tax needs to be stored in another instance float variable “tax”.
  This method will display the following message in the console.
  “The Tax of the employee  for  the   <basic Salary> is <tax>”*/

	void calculateTax() {																		//1st method to calculate tax
		tax = (30*basicSalary)/100;																//logic
		System.out.println("The Tax of the employee for the " + basicSalary + " is: " + tax);}	//printing output
	
/*Problem Statement 3: 
  In the TaxCalculator class  create a method named  deductTax() method 
  this should reduce the tax calculated in problem statement 1 from  the basic salary and 
  store it in a  instance int variable named  “nettSalary”.
  his method will also display the following message in the console.
  “The nett salary of the employee” <nettSalary>*/

	void deductTax() {																			//2nd method to calculated reduced salary
		int nettSalary = (int) (basicSalary-tax);												//logic
		System.out.println("The nett salary of the employee : " + nettSalary);}					//printing output	
	
/*Problem Statement 4: Usage of relational operator
	In the TaxCalculator class  create a method named  validateSalary() 
	method should display a message as below 
	if the basicSalary  is greater than 1 lakh  and  citizenship is true.
	“The salary and citizenship eligibility:  ” <response>
	<response> - The value would be printed as true
	 if basic salary > 1 lakh and citizenship is true.
	The value would be printed as false for other conditions.*/

	void validateSalary() {																		//3rd method to check citizenship eligibility
		String response;
		if(basicSalary>100000 && citizenship==true) {											//checking if eligibility true
			response="true";
		}else {																					//else false
			response="false";
		}
		System.out.println("The salary and citizenship eligibity : " + response);				//printing output
	}}

/*Problem Statement 5: 
  Develop another class “EmployeeTax”  inside the package “ com.cognizant.tax” 
  add a main method which sets the values and invoke the following methods in 
  the TaxCalculator object.*/

public class EmployeeTax {																		//2nd class with main method

	public static void main(String[] args) {													//main method to call the previous methods
		// TODO Auto-generated method stub
		TaxCalculator salary = new TaxCalculator();												//creating object of 1st class
		
	/*Test Case 1:  Specify the following values and run the main method
		1.	Set  the value of citizenship as true, basicSalary as 25000.
		2.	Invoke the methods calculateTax(), deductTax(), validateTax().*/

		System.out.println("1st output: ");
		salary.basicSalary=25000f;																//initializing values for instance variable
		salary.citizenship=true;																
		salary.calculateTax();																	//calling previous class methods
		salary.deductTax();
		salary.validateSalary();
		System.out.println();
		
	/*Test Case 2:  Specify the following values and run the main method
		1.	Set  the value of citizenship as true, basicSalary as 125000.
		2.	Invoke the methods calculateTax(), deductTax(), validateTax().*/

		System.out.println("2nd output: ");														
		salary.basicSalary=125000f;																//initializing 2nd set of values for instance variable
		salary.citizenship=true;							
		salary.calculateTax();																	//calling methods for 2nd set of values
		salary.deductTax();
		salary.validateSalary();
	}
}