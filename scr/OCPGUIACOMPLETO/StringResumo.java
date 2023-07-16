package scr.OCPGUIACOMPLETO;

public class StringResumo {

	public static void main(String[] args) {
		var s1 = "Java";
		 var s2 = "Java";
		 var s3 = "Ja".concat("va");
		 var s4 = s3.intern();
		 var sb1 = new StringBuilder();
		 sb1.append("Ja").append("va");

		 System.out.println("s1 == s2 " + (s1 == s2)); //true
		 System.out.println("s1.equals(s2) " + s1.equals(s2)); //true
		 System.out.println("s1 == s3 " + (s1 == s3)); //false
		 System.out.println("s1 == s4 " + (s1 == s4)); //true
		 System.out.println("sb1.toString() == s1 " + (sb1.toString() == s1)); //false
		 System.out.println("sb1.toString().equals(s1) " + sb1.toString().equals(s1)); //true

	}

}
