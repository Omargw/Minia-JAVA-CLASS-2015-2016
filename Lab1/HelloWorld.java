/*  "public" tells Java that this should be available to all other classes
 *  classes are blue prints used to design objects that contain 
 *  attributes (variables) and methods (functions)
 *  
 *  "class"  tells Java that we are going to define a class 
 *  
 *  "HelloWorld" is just the class name (every thing must have a name)
 */
import java.util.Scanner;
public class HelloWorld{
	
	/* "public" means it can be accessed by other classes
	 * "static" accessed only by class name, dosen't need any Object instance
	 * "void" dosen't return any value after execution
	 * "String[] args" arguments from console (command line) cmd 
	 * */
	 
	public static void main(String[] args)
	{
		 
		/* "println" a method used to print string or text to the screen
		 * "System.out"  out is member of System class , that contain a method
		 * 				 called "println" used to print text to screen.
		 * */
		System.out.println("Hello World!"); // print text and start a new line 
		System.out.print("Hello");	// print text without starting a nwe line
		System.out.println(" World!");
		
		//Deceleration statement 
		int num1;
		// Assignment statement
		num1 = 10;
		int num2 = 5;
		int num3 = 2;
		// expression statement
		num3 = num1 + num2;
		
		//Whitespace 
		num1 = 100 + 3;
		num2
		=
		9
		-
		1
		; // this is the most important thing that Java cares about 
		
		// Java Primitive Types
		byte bigByte = 127; //  (2^8-1) Minimum value -128 Maximum value 127
		short bigShort = 32767; // (2^16-1)  Minimum value -32768 Maximum value 32767
		int bigInt = 2147483647; // (2^32-1)  Minimum value -2147483648 Maximum value 2147483647
		long bigLong = 9223372036854775807L; //(2^64-1)  Minimum value -9223372036854775808L
		float bigFloat = 3.14F; // You must end a float with an F
		double bigDouble = 3.1234567890D; // The D is not required with doubles			
		// Determine your system's Max values 
		System.out.println(Float.MAX_VALUE); // Float is precise to 6 decimal places
		System.out.println(Double.MAX_VALUE); // Double is precise to 15 decimal places
		
		
		// A char will accept a number or a character surrounded by apostrophes
		char randomChar = 65; // ASCII Code // Character Code for A is 65 Minimum value 0 Maximum value 65535
		char anotherChar = 'A';
		System.out.println(randomChar);
		
		// Booleans are True or False, not 1 or 0
		boolean trueOrFalse = true; 
		
		// chars can also contain escaped characters (not printed as it is)
		char backSpace = '\b'; 
		char formFeed = '\f'; 
		char lineFeed = '\n';
		char carriageReturn = '\r';
		char horizontalTab = '\t';
		char doubleQuote = '\"';
		char singleQuote = '\'';
		char backSlash = '\\';
		
		
		
		// A string contains a series of characters
		String randomString = "I'm just a random";
		String anotherString = "string";
		
		// You combine strings with a +
		String combinedString = randomString + ' ' + anotherString;
		System.out.println(combinedString);
		
		
		// How to convert any other type to a string
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		String booleanString = Boolean.toString(trueOrFalse);
		String charString = Character.toString(randomChar); // You don't need to do this
		
		System.out.println(charString);
		
		// Can't do this because char is a primitive data type
		// System.out.println(randomChar.getClass());
		
		// You can do this because String is an object
		System.out.println(charString.getClass());
		
		// You use casting to convert from one primitive type to another
		// If you convert from a number that is to big the largest possible value will be 
		// used instead
		double aDoubleValue = 3.1456789;
		int doubleToInt = (int) aDoubleValue;
		System.out.println(doubleToInt);
		
		/* To cast to other primitive types just proceed with the conversion to type
		 * ie (byte) (short) (long) (double) 
		 * (float) & (boolean) & (char) don't work. 
		 * (char) stays as a number instead of a character
		 */
		
		// Use parseInt to convert a string into an integer
		int stringToInt = Integer.parseInt(intString);
		
		/* Other parse functions
		 * parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean
		 * There is no reason to parse a Character
		 */
	}
	
}
