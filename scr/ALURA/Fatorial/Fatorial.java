package scr.ALURA.Fatorial;

public class Fatorial {

	public static void main(String[] args) {
		
		int n = 6;
		int resultado = fatorial(n);
	
	    
		System.out.println(resultado);
	}
	
	public static int fatorial(int n) {
		if(n == 0 || n == 1 )
			return 1;
		else
			return n * fatorial(n -1);
	}

}
