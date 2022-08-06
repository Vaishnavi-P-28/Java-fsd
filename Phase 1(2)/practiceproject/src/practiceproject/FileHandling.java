package practiceproject;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[]args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			Readfile r=new Readfile();
			Appendfile a=new Appendfile();
			while(true) {
				System.out.println("Enter the switch case option");
				int code=sc.nextInt();
				switch(code) {
				case 1: CreateNewFile.createFileIn_NIO();
				       break;
				case 2: r.readfile();
				       break;
				case 3: a.appendfile();
				       break;
				case 4: System.exit(0);
				}
				
				}
		}
		}


}
