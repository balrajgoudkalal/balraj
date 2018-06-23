package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List usernames=new ArrayList();
		
		usernames.add("Hello");
		
		usernames.add("Parthap");
		
		usernames.add("India");
		
		//Retriving value from a list
		System.out.println(usernames.get(0));
		
		//get all the elements in a list
		
		for(int i=0;i<=usernames.size()-1;i++)
		{
			System.out.println(usernames.get(i));
			
		}

		//remove an item from a list
		usernames.remove(1);
		System.out.println("**************************");
		
		for(int i=0;i<=usernames.size()-1;i++)
		{
			System.out.println(usernames.get(i));
			
		}
		//clear all the values of a list
		usernames.clear();
		System.out.println("##########################");
		for(int i=0;i<=usernames.size()-1;i++)
		{
			System.out.println(usernames.get(i));
			
		}
		usernames.add("Amazon");
		System.out.println(usernames.get(0));
	}

}
