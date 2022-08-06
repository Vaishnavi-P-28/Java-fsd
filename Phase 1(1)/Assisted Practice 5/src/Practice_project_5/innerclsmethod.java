package Practice_project_5;

public class innerclsmethod {
	public void Display()
	{
		class inner
		{
			void display()
			{
				System.out.println("You have accessed the inner class within the method");
			}
		}
		inner in = new inner();
		in.display();
	}
	
	
	public static void main(String[] args)
	{
		innerclsmethod icm = new innerclsmethod();
		icm.Display();
	}
}
