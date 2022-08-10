package Practice_project_7;
import java.util.Map;
import java.util.TreeMap;
public class treemap {
	public static void main(String[] args)
	{
	      TreeMap<Integer,String> map=new TreeMap<>();    
	      map.put(8,"Annie");    
	      map.put(9,"Carlotte");    
	      map.put(10,"Catie");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(@SuppressWarnings("rawtypes") Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    

	}

}
