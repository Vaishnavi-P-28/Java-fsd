package Practice_project_7;
import java.util.Map;
import java.util.*;

public class hashmap {
	public static void main(String[] args)
	{
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(1,"vichu");
		hs.put(2,"is a ");
		hs.put(3,"good boy");
		
		System.out.println(hs.get(0));
		
		for(Map.Entry<Integer,String> e : hs.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
