package com.Constructor;

public class ClassA {
	
	
	
	static
	{
		System.out.println("i am a static block");
	}
	
	{
		System.out.println("i am a instance block");
	}
	
	
	public ClassA()
	{
		
		System.out.println("i am a parent class constructor");
		
		
	}
	
	
	public ClassA(int a,int b)
	{
		
		System.out.println("i am a parent class constructor with two parameters");
		
		
	}

}
