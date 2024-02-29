package com.edubridge.regularexpression;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello, Kavya, Sharma, lucky, sharma";
		String [] res=text.split(",");
		for  (String itr:res)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		String str1="There are 4memebers in my family";
		String regx= "\\d+";
		String res1=str1.replaceAll(regx, regx)
				System.out.println();
	}

}
