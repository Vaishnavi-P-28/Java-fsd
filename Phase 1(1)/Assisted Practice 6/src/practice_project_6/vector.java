package practice_project_6;
import java.util.Vector;
public class vector {
	public static void main(String[] args)
	{
		Vector<Integer> v1 = new Vector<Integer> ();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println(v1);
		
		for(int i = 0; i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		
		v1.clear();
		System.out.println(v1);
		
		for(int j = 0; j<5;j++)
		{
			v1.add(j);
		}
		for(int in = 0; in<v1.size();in++)
		{
			System.out.println(v1.get(in));
		}
		System.out.println(v1);
	}

}
