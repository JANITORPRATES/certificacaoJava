package scr.OCPGUIACOMPLETO.Excessoes;

import java.io.FileNotFoundException;

public class ExceptionResumo {

	public static void main(String... unused) {
	        System.out.print("a");
	        //try (StringBuilder reader = new StringBuilder()) { StringBuilder n�o implementa AutoCloseble
	        try {
	           System.out.print("b");
	           throw new IllegalArgumentException();
	      // } catch (Exception  | RuntimeException e) { RuntimeException desnecess�rio
	        }catch (Exception e) {
	          System.out.print("c");
	          //throw new FileNotFoundException();
	       } finally {
	          System.out.print("d");
	    } }

}
