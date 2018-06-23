package com.Interfaces;

public  class ClassA implements OwnInterface,Interface2{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(" iam a add method");
	}
	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(" iam a sub method");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void myownMethod()
	{
		System.out.println("my own method");
	}
	

}
