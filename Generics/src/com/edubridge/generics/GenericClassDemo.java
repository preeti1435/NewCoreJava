package com.edubridge.generics;
class 	Citizen<T>
{
	T str;
	T str1;

void print (T str, T str1)
	{
		this.str=str;
		this.str1=str1;
		System.out.println("The Value is: " +str+" "+str1);
	}
}
public class GenericClassDemo {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen<String> c =new Citizen<>();
		c.print("nagpur", "Indian");
	}
}
