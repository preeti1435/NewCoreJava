package com.edubridge.oopsguestlec;

public class ObjectAndClassMyPractice {
	int price;
	String pname;
	
	void display(String p, int p1) {
	pname=p;
	price=p1;
	System.out.println("ProdutName: "+pname+"" +"\nProduct Price: "+price);
	}
	

	public static void main(String[] args) {
		ObjectAndClassMyPractice p=new ObjectAndClassMyPractice();
		p.display("spakers", 2000);
		p.display("Hp Laptop", 50000);
		p.display("earphones", 2000);
		p.display("mouse", 2000);
		
		

	}

}
