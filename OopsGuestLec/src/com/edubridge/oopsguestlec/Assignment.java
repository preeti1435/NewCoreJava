package com.edubridge.oopsguestlec;
class Members{
	String Name;
	int age;  
	int phoneNumber;
	String Address;
	int salary;
	
	void printSalary() 
	{
		System.out.println("Salary of: " +Name+ "is" + salary);
	}
}
 class Emp extends Members
 {
	 String Specialization;
 }
 class Manager extends Members
 {
	 String Department;
 }
 public class Assignment {
	 
	public static void main(String[] args) {
		Emp  e1= new Emp();
		Manager m1 =new Manager();
		
		e1.Name = "Snehal";
		e1.age=23;
		e1.phoneNumber=2032560148;
		e1.Address="Thane";
		e1.salary=50000;
		e1.Specialization="ComputerEngineer";
		m1.Department="IT";
		e1.printSalary();
		System.out.println();
	}

}
