package simulater;

public class screen {
	void display_seats()
	{
		System.out.println(" Screen this side");
		System.out.println("\t      A 1 2 3 4 5 6 7 8 9 10 11 12  Gold â€“  â‚¹ 150");
		System.out.println("\t      B 1 2 3 4 5 6 7 8 9 10 11 12  Gold - â‚¹ 150");
		System.out.println("\t      C 1 2 3 4 5 6 7 8 9 10 11 12  Gold â€“  â‚¹ 150");		
		System.out.println("\n\n  Please Enter Preferred Row. Seat will be booked as per availability.");
	}
	
	String getcat(String a)
	{
		String cat;
		if(a.compareToIgnoreCase("A")==0||a.compareToIgnoreCase("B")==0)
			cat="Gold";
		
		else
			cat="N/A";
		return cat;
	}
	
	int getcost(String cat)
	{
		int cost = 0;
		if(cat.compareToIgnoreCase("Gold")==0)
			cost=150;
		
		else
			return 0;
		return cost;
	}


}
