package practice_project_6;
import java.util.Iterator;
import java.util.Stack;
public class stackcollect {
	public static void main(String[] args)
	{
		Stack<String> s1 = new Stack<String>();
		s1.add("Vichu");
		s1.add("is a");
		s1.add("good boy");
		System.out.println(s1);
		
		s1.push("this");
		s1.push("is a ");
		s1.push("beautiful world");
		System.out.println(s1);

		s1.pop();
		System.out.println(s1);
		
		Iterator <String> i1 = s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}

}
