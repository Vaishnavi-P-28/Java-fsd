package simulater;
import java.util.*;

public class customerdetail {
	screen s = new screen();


	void print_ticket(String movie,String showtime,int screen,String cat, String rowch, int colch)
	{
		Date date = new Date();
		int cost = s.getcost(cat);
	
		System.out.println("========================DT Cinemas=======================");
		System.out.println("\t\t      ----Ticket----");
		System.out.println("\tMovie: "+movie+"\t");
		System.out.print("\tTime: "+showtime);
		System.out.println("\t\t\tSeat: "+rowch+colch);
		System.out.print("\tCategory: "+cat);
		System.out.println("\t\t\tScreen: "+screen);
		System.out.println("\tDate: "+date);
		System.out.println("\tPrice: â‚¹"+cost);
		System.out.println("\tThank You! Hope to see you again soon!\n\n");
	}


}
