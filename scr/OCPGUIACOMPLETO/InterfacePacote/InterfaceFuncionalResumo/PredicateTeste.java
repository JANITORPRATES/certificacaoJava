package scr.OCPGUIACOMPLETO.InterfacePacote.InterfaceFuncionalResumo;

import java.util.function.Predicate;

public class PredicateTeste {

	public static void main(String[] args) {
	        System.out.println(metodo(i -> i == 5));
	        System.out.println(metodo(i -> { return i == 5;}));
	        System.out.println(metodo((i) -> i == 5));
	        
	        //System.out.println(metodo((int i) -> i == 5)); ERRADO
	        System.out.println(metodo((Integer i) -> i == 5)); //CERTO
	        
	       
	     }
	     private static boolean metodo(Predicate<Integer> p) {
	        return p.test(5);
	     }
}
