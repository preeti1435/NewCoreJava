package com.edubridge.generics;

public class GenericMethorDemo {
	public static <E> void accept(E[] arr)
	{
		for (E itr :arr)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]arr1= {55,25,68,56};
		String []arr2= {"priya","priti","pooja","geeta"};
		System.out.print("first:  ");
		GenericMethorDemo.accept(arr1);
		
		System.out.print("second:  ");
		GenericMethorDemo.accept(arr2);
		
	}

}
