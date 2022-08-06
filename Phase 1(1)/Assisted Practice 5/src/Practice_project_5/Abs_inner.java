package Practice_project_5;
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


public class Abs_inner {
	public static void main(String[] args) 
	{
		AnonymousInnerClass i = new AnonymousInnerClass() 
		{
			public void display() 
			{
	        System.out.println("Anonymous Inner Class");
	        }
        };
	    i.display();
    }

}
