package Practice_project_5;

public class innerclass {
	public class inner
	{
		public void Display()
		{
			System.out.println("You accessed the Inner class");
		}
	}
	public static void main(String[] args)
	{
		innerclass inc = new innerclass();
		innerclass.inner in = inc.new inner();
		in.Display();
	}

}
