
public class data_type_casts {
	
	public static void main(String[] args){
		/* I forgot to initialize the variables below, local variables
		 * created in a method must be initialized*/
		byte b = 127;
		short s = 23000;
		int i = 320000;
		long l = 6400000;
		boolean boo = true;
		float f = (float)2.8; /* In Java, when you type a decimal number as 3.6, its interpreted as a double. 
		double is a 64-bit precision IEEE 754 floating point, while float is a 32-bit precision IEEE 754 floating point. 
		As a float is less precise than a double, the conversion cannot be performed implicitly.
		If you want to create a float, you should end your number with f (i.e.: 3.6f).*/
		double d = 6.4;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(boo);
		System.out.println(f);
		System.out.println(d);
	}

}
