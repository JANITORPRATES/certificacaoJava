package scr.ALURA;

public class Fatorial2 {

	public static void main(String[] args) {
		
		int n = 10;
		
		int fatorial = n;
		int aux;
		for(int i = 1; i <= n; i++) {
			aux = n - i;
			if(aux == 1 || aux == 0) {
				aux = 1;
			}
			
			fatorial *= aux;
		}
		
		System.out.println(fatorial);

	}

}
