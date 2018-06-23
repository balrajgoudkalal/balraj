package com.Collections;

import java.util.HashMap;

public class HasMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap mp=new HashMap();
		
		mp.put("Tc1", "pass");
		
		System.out.println(mp.get("Tc1"));
		
		for(int i=0;i<=mp.size()-1;i++)
		{
			System.out.println(mp.get(i));
		}
		

	}

}
