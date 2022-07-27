import java.util.ArrayList;
import java.util.Scanner;
public class validation {
public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("abcd@gmail.com");
        emailID.add("@yahoo.com");
        emailID.add("domain.com");
        emailID.add("user_name@domain.com");
        emailID.add("1234@gmail.com");
        
         String searchEmail = null;
         System.out.println("Enter the email to search");
         
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter email Id : ");
          searchEmail = sc.nextLine(); 
		}
             if(emailID.contains(searchEmail)){
          System.out.println("email ID " + searchEmail + " found");
      }
      else{
          System.out.println( "email ID " + searchEmail + " not found");
      }
 
        
    }

}
