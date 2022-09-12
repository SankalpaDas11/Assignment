class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80d;
	double Hra = 1000.50d;
	public Employee (long Id, String Name, String Address, long Phone ) {
		 this.employeeId = Id;
		 this.employeeName = Name;
		 this.employeeAddress = Address;
		 this.employeePhone = Phone;
	}
	public void calculateSalary() {
		double salary;
		salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100);
		System.out.println(salary);
	}
	public void calculateTransportAllowance() {
		double allowance;
		allowance =  10/100*basicSalary;
		System.out.println(allowance);
	}
}
class Manager extends Employee {

	Manager(long Id, String Name, String Address, long Phone, long salary) {
		super(Id, Name, Address, Phone);
		basicSalary = salary;
	}
	public void calculateTransportAllowance() {
		double allowance =  15/100*basicSalary;
		System.out.println(allowance);
	}
}
class Trainee extends Employee {

	Trainee(long Id, String Name, String Address, long Phone, double salary) {
		super(Id, Name, Address, Phone);
		basicSalary = salary;
	}
	@Override
	public void calculateTransportAllowance() {
		double allowance =  15/100*basicSalary;
		System.out.println(allowance);
	}
}
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager Peter = new Manager(126534, "Peter", "Chennai, India", 237844, 65000);
		Trainee Jack = new Trainee(29864, "Jack", "Mumbai, India", 442085, 45000);
		Peter.calculateSalary();
		Jack.calculateSalary();
		Peter.calculateTransportAllowance();
		Jack.calculateTransportAllowance();
	}
}
