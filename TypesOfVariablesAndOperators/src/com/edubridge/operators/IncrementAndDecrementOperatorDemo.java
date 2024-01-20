package com.edubridge.operators;

import java.util.Scanner;
//PROGRAM TO DEMOSTRATE INCREAMENT AND DECREAMENT
public class IncrementAndDecrementOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for a and b:");
		int a=6, b=3;
		int res=a++ - ++b;
		int res2= --a + b--;
		System.out.println(a);
		System.out.println(b);
		
	
	}

}
