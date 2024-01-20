package com.edubridge.filtering;

import com.sun.tools.javac.util.List;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=Array.asList("Shifa","Preeti","Pooja");
		obj.stream().map(i->i.toUpperCase()).forEach(i->System.out.print(i+" "));

	}

}
