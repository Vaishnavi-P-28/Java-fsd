package practice_project_6;

import java.util.LinkedList;

public class linkedList {
	public static void main(String[] args)
	{
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	System.out.println(ll);
	
	for(int i = 0; i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	ll.clear();
	System.out.println(ll);
	
	for(int j = 0; j<5;j++)
	{
		ll.add(j);
	}
	for(int in = 0; in<ll.size();in++)
	{
		System.out.println(ll.get(in));
	}
	System.out.println(ll);
	
	
	
	
	
	
	
}
}
