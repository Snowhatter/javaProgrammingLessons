
public class data_types { /* public class; the file has to match the name of the public class */
	/*
	 * variables can be declared here at the class level
	*/
	public static int myAge ; /* semi-colon is absolutely necessary*/
	public static int myInt = 12 ; 
	/* 
	 * variables declared as public are available throughout the program, variables declared as 
	 * private are only available within this class, variables declared protected are available to this class, subclasses 
	 * and packages built on this class 
	 * 
	 * variables can begin with an underscore; 
	 * the old standard is that a class-level variable should 
	 * in fact start begin with an underscore
	 * 
	 * variables initialized in the class do not necessarily need to be initialized explicitly
	*/
	public static void main(String[] args){ /* method */	
	/*
	 * variables can be declared in the method and they are local to the method
	 * variables declared in a method MUST be initialized explicitly
	 */
		int myHead=12;
		System.out.println(myAge);
		System.out.println(myInt);
		System.out.println(myHead);
	}

}

