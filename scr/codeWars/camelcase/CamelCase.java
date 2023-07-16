package scr.codeWars.camelcase;
/*
 * Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */

public class CamelCase {

	public static void main(String[] args) {
		System.out.println(camelCase("camelCasingTest"));

	}
	
	 public static String camelCase1(String input) {
		    return input.replaceAll("([A-Z])", " $1");
		  }

	public static String camelCase(String input) {
		StringBuilder copia = new StringBuilder();
		String[] arrayString = input.split("");

		for (int i = 0; i < arrayString.length; i++) {
			String original = arrayString[i];

			if (i == 0) {
				copia.append(original);
				continue;
			}

			String copy = original.toUpperCase();
			if (original.equals(copy)) {
				copia.append(" ");
				copia.append(original);
			} else
				copia.append(original);

		}

		return copia.toString();
	}
	
	 public static String camelCase2(String input) {
		    String output = "";
		        for (int i = 0; i < input.length(); i++) {
		            output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
		        }
		        return output;
	 }
	 
	 public static String camelCase3(String input) {
		    
		    String x="";
		    for(int i=0;i<input.length();i++)
		    {
		    if(Character.isUpperCase(input.charAt(i)))
		    {
		    x=x+" ";
		    }
		    x=x+input.charAt(i);
		    
		    }
		 return x;
		 }

}
