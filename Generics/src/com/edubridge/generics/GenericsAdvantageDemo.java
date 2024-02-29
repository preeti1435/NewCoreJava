package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<>();
		obj.add("11");
		obj.add("shivani");

		List<String> obj1=new ArrayList<>();
		obj1.add("abcdefght jklmnop");
		obj1.add("shifa");
		
		
		String str1=obj1.get(0);
		System.out.println(str1);
	}

}
