package practice_project_6;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Vichu");
		ts.add("is a ");
		ts.add("good boy");
			
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
