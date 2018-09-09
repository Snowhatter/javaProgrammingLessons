
public class for_loop_demo1 {
	public static void main(String[] args)
	{
		for(int i=0, x=10; i<10;) 
		/* i & x should be the same data type*/
		{
			System.out.println("counter " + i + " " + x);
			i++;
			x--;
		}
		System.out.println("Done");
	}
}
