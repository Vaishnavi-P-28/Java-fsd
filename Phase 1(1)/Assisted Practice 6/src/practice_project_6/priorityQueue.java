package practice_project_6;
import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
