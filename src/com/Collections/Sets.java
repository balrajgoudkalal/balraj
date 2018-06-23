package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {


		Set st=new HashSet();
		
		st.add("Hello");
		
		st.add("India");
		
		st.add("text");
		
		Iterator itr=st.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr=st.iterator();
		st.remove(1);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
