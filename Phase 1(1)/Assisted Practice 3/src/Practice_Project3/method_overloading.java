package Practice_Project3;

public class method_overloading {
	public int addition(int a, int b)
	{
		return (a+b);
	}
	public int addition(int a, int b, int c)
	{
		return(a+b+c);
	}
	
	public void addition(int...a)
	{
		System.out.println("Enter values less than count:3");
	}
	
	public static void main(String[] args)
	{
		method_overloading mo = new method_overloading();
		System.out.println(mo.addition(1,2));
		System.out.println(mo.addition(1,2,3));
		mo.addition(1,2,3,4);


	}
}
