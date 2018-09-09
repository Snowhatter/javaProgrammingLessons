
public class stringsDemo {
	public static void main(String[] args)
	{
		/*In Java Strings are 'Objects' and require the 'new' 
		 * operator to instantiate a string object
		 * 
		 * A String is not a variable
		 * */
		String myString1 = new String();
		myString1 = "hi";
		
		String myString2 = new String("hello");
		String s1 = "fun";
		String s2 = "FUN";
		String s3 = "They Say It's Your Birthday, Happy Birthday to You!!!";
		
		System.out.println(myString1);
		System.out.println(myString2);
		System.out.println(myString2.charAt(3));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s3.length());
		
		
	}

}
