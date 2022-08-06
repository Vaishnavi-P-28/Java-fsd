package simulater;
import java.util.*;
public class Movie {
	private static Scanner in;

	public static void main(String args[]){
		in = new Scanner(System.in);
		Login l=new Login();
		l.SampleLogin();
		int ch,i,n,movch; String rowch[]=new String[12];
		int colch[]=new int[12];
		String time = new String();
		String timecheck = new String();
		authendicator objshow = new authendicator();
		screen objscreen = new screen();
		customerdetail objticket = new customerdetail();
		while(true){
		System.out.println("\n\t\t   Movie Ticket Booking System\n");
		System.out.println("1.Book Movie Tickets");
		System.out.println("2.See Movies/Show Timings");
		System.out.println("3.Exit");
		System.out.println("\nAdvanced Bookings are closed as of now.");
		System.out.println("\nEnter Choice");
		ch = in.nextInt();
		switch(ch)
		{
			case 1:	objshow.display_show_timings();
					System.out.println("Choose the Movie");
					movch=in.nextInt();
					do{
					System.out.println("Enter Show timings (hh:mm)");
					time=in.next();
					timecheck=objshow.check_time(movch,time);
					}while(timecheck.equals("false"));
					System.out.println("Enter Number of seats");
					n=in.nextInt();
					for(i=0;i<n;i++){
						objscreen.display_seats();
						rowch[i]=in.next().toUpperCase();
						objshow.show_empty_seats(rowch[i],movch);
						colch[i]=in.nextInt();
						if(objshow.check_seats(rowch[i],colch[i],movch))
						{
							System.out.println("Seat is not available");
						}
						objshow.fill_seat(rowch[i],colch[i],movch);
					}
					for(i=0;i<n;i++)
					{
								objticket.print_ticket(objshow.getmovie(movch), time, 3, objscreen.getcat(rowch[i]), rowch[i], colch[i]);
					}
					break;
				
			case 2: objshow.display_show_timings();
					break;
					
			case 3: System.exit(0);			
		}
	}
	}


}
