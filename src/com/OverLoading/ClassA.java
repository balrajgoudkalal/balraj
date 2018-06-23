package com.OverLoading;

public class ClassA {
	
	
	public static int a;
	
	public static int b=120;

	public static void main(String[] args) {
		
		ClassA a=new ClassA();
		
		a.add(10,30);
		
		
		
	}
	
	
	public  void add(int a,int b)
	{
		
		System.out.println(a+b);
		
		System.out.println(this.a+this.b);
	}

	
	public  void add(int a,int b,int c)
	{
		
		System.out.println(a+b+c);
	}
}
