package practice_project_6;
import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		for(int i = 0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		al.clear();
		System.out.println(al);
		
		for(int j = 0; j<5;j++)
		{
			al.add(j);
		}
		for(int in = 0; in<al.size();in++)
		{
			System.out.println(al.get(in));
		}
		System.out.println(al);
	}

}
