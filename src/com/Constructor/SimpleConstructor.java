package com.Constructor;

public class SimpleConstructor {
	
	
	public static int a=78;
	
	public static int b=2;

	
	public  SimpleConstructor()
	{
		this(22,3);
		System.out.println("i am zero argument constructor");
		
	}
	
	
	public  SimpleConstructor(int a,int b)
	{
		System.out.println("i am parameterized  constructor");
		
		System.out.println(a+b);
		
		System.out.println(this.a+this.b);
	}
	
	
	
	public static void main(String[] args) {
		

		
		SimpleConstructor cons=new SimpleConstructor();
		
	
		
	}

}
