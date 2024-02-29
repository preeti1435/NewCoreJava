package com.edubridge.oopsguestlec;

public class ClassAndObject {
	int empId=101;
	String empName="Jhon Smith";
	int age =21;
	void testing() {
		System.out.println("Testing is in process");
	}

	public static void main(String[] args) {
		ClassAndObject e1=new ClassAndObject();
		System.out.println("Employee Id:" +e1.empId+ "\nEmployee Name" +e1.empName+"\n Employee Age: " + "" +e1.age);
		e1.testing();

	}

}
