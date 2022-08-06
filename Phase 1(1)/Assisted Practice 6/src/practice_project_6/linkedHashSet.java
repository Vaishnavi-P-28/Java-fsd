package practice_project_6;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class linkedHashSet {
	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Vichu");
		lhs.add("is a ");
		lhs.add("good boy");
			
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
