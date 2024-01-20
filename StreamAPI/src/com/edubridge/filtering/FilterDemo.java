package com.edubridge.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> obj=Arrays.asList("Shifa","Preeti","Pooja");
		obj.stream().filter(i->i.length()>5).forEach(i->System.out.println(i));
		
		Stream<Integer>obj1=Stream.of(11,4,25,36);
		System.out.println(obj1.count());
		obj.stream().limit(2);
		forEach(i->System.out.print(i+" "));
	}

	}


