package om.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetPatterns {

	public static void main(String[] args) {

String str="On whole transaction the Total   Estimated   Tax : $     896234  transaction complted";


String pattern="\\d";

String temp="";

Pattern p=Pattern.compile(pattern);


Matcher m=p.matcher(str);


while(m.find())
{
	
		
	temp=temp+m.group();
	
		
	
	
	
	
}	
		
		
System.out.println(temp);	
		
		
		

	}

}
