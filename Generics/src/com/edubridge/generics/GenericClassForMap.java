package com.edubridge.generics;

class Dictionary<K,V>
{
	K key;
	V value;
	
	void print(K key, V value)
	{
		this.key=key;
		this.value=value;
		System.out.println("the value is: "+key+" "+value);
	}
}
public class GenericClassForMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


