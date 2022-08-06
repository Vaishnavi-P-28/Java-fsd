package RegExp.java;

import java.util.regex.*;

public class RegExp {
	
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("ishu",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("aishu how are you");
		boolean matchSts = m.find();
		if(matchSts)
		{
			System.out.println("ishu is found in the matcher!");
		}
		else
		{
			System.out.println("Not found match");
		}
		
		//
		Pattern p1 = Pattern.compile("Hello");
		Matcher m1 = p1.matcher("How are you");
		System.out.println(m1.matches());
		
		//
		Pattern p2 = Pattern.compile(".s");
		Matcher m2 = p2.matcher("as");
		System.out.println(m2.matches());
		
		//
		Pattern p3 = Pattern.compile("\\s");
		Matcher m3 = p3.matcher(" ");
		System.out.println(m3.matches());
		
		
	}

}
