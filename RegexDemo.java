

//** ---------JAVA REGEX EXAMPLE -----------------**//

import java.util.regex.*;

public class RegexDemo {

	 public static void main(String args[]) {
		//1st way is 
		Pattern p = Pattern.compile("...L");
		Matcher m = p.matcher("helL");
		boolean _b1 = m.matches();
		
		System.out.println("The Regex should be 1 is : "+_b1);
		
		//2nd way is
		boolean _b2 = Pattern.matches("..er", "Ahmer");
		System.out.println("The Regex shoud be 2 is : "+_b2);
	 
	 
	    //Some examples of regular expressions
		System.out.println(Pattern.matches("[abc]", "c"));//[]check single character
		System.out.println(Pattern.matches("[^abc]", "l"));//leaving or except abc check
		System.out.println(Pattern.matches("[a-mA-Z]", "M"));//any char from a-z and A-Z
	 
	 }
  
}
