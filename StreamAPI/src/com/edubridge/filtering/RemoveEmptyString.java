package com.edubridge.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=Arrays.asList("riya","priya","shriya","");
		String res=obj.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(res);
	}

}
