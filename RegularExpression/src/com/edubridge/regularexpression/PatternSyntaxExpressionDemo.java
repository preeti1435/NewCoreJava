package com.edubridge.regularexpression;

import java.util.regex.Pattern;

public class PatternSyntaxExpressionDemo {
	Static DString regex="[";
	static String input "i love mumbai";
	static String replace = "cat";
	

	public static void main(String[] args) {
		try {
			Pattern  pattern= pattern.comiler(regex);
			Matcher matcher= pattern.matcher(input);
		}
		
		catch( PatternSyntaxExpressionDemo e)
		{
			System.out.println(" PatternSyntaxExpressionDemo");
			System.out.println("Description: "+e.getDescription());
			System.out.println("Description: "+e.getindex());
			
		}
		
	}

}
