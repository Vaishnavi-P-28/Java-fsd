package Practice_project_7;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args)
    {
    	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
        
        ht.put(4,"Ales");  
        ht.put(5,"Rosy");  
        ht.put(6,"Jack");  
        ht.put(7,"John");  

        System.out.println("\nThe elements of HashTable are ");  
        for(@SuppressWarnings("rawtypes") Map.Entry n:ht.entrySet()){    
         System.out.println(n.getKey()+" "+n.getValue());    
        }
    }

}
