package practiceproject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Appendfile {
	void appendfile()throws IOException {
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try {
			fw=new FileWriter("names.txt",true);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			pw.println("text");
			System.out.println("Data successfully appended into file");
			pw.flush();
		}finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			}catch(IOException io) { }
			
		}
}

}
