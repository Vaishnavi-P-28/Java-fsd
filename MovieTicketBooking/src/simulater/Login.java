package simulater;

import java.util.Scanner;

public class Login {
	@SuppressWarnings("resource")
	public void SampleLogin(){
	    String Username;
	    String Password;
	    Username ="Admin";
	    Password ="Admin";
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the username");
	    String username=sc.next();
	    System.out.println("Enter the Password");
	    String password=sc.next();
	   if(username.equals(Username)&&password.equals(Password)) {
		   System.out.println("Login successfully");
	   }
	   else if(username.equals(Username)) {
		   System.out.println("Invalid password");
	   }
	   else if(password.equals(Password)) {
		   System.out.println("Invalid username");
	   }
	   else {
		   System.out.println("Invalid username and password");
	   }
   }


}
