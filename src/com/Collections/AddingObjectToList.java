package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class AddingObjectToList {

	public static void main(String[] args) {
		
		//step 1
		CustomList lst=new CustomList();
		
		//step 2:
		
		List<CustomList> mylist=new ArrayList<CustomList>();
		
		lst.testcase="Tc1";
		lst.description="SmokeTest";		
		lst.status="Pass";
		
		mylist.add(lst);
		
		for(int i=0;i<=mylist.size()-1;i++)
		{
			System.out.println(mylist.get(i).testcase);
			System.out.println(mylist.get(i).description);
			System.out.println(mylist.get(i).status);
			
			//excel logic 
		}
		mylist.clear();
		
		
		lst.testcase="Tc2";
		lst.description="SmokeTest2";		
		lst.status="fail";
		
		mylist.add(lst);
		
		for(int i=0;i<=mylist.size()-1;i++)
		{
			System.out.println(mylist.get(i).testcase);
			System.out.println(mylist.get(i).description);
			System.out.println(mylist.get(i).status);
		}
		
	
		
		
		
		
		

	}

}
