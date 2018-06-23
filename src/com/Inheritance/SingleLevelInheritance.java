package com.Inheritance;

import java.awt.image.SinglePixelPackedSampleModel;

public class SingleLevelInheritance extends Parent{

	public static void main(String[] args) {
		
		
		
		//Before modifiction
		
				System.out.println("The number of houses before modification "+number_houses);
		
		
				number_houses=3;
		
		//After modifiction
		
				System.out.println("The number of houses After modification "+number_houses);
	

		//System.out.println(number_cars);
				
				build_House();
					
		//parent p=new child();
				
				
				Parent p=new SingleLevelInheritance();
				
				p.build_House();
		
	}
	
	public static void build_House()
	{
		
		System.out.println("I built my ownhouse baed on my wish");
		
	}
		
	
	

}
