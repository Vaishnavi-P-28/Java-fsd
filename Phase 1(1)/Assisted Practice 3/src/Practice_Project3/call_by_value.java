package Practice_Project3;

public class call_by_value {
int a=10;
	
	/*call_by_value(int a, int b)
	{
		this.a = a;
		this.b = b;
	}*/
	
	public int operation(int a)
	{
		this.a = a*100*10;
		return a;
	}
	
	public static void main(String[] args)
	{
		call_by_value cbv = new call_by_value();
		System.out.println("Before Operation : ");
		System.out.println(cbv.a);
		System.out.println("After Operation : ");
		cbv.operation(10);
		System.out.println(cbv.a);
	}

}
