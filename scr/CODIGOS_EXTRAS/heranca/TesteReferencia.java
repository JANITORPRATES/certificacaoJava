package scr.CODIGOS_EXTRAS.heranca;

import java.util.Scanner;

public class TesteReferencia {

	public static void main(String[] args) {
		A3 aB = new B();
		//aB.id = 3;
		System.out.println(aB.variavel);

		aB.metodo2();
		
		Scanner teste = new Scanner("CC, 4573, 4622947, JANITOR PRATES");
		
		teste.useDelimiter(",");
		
	}

}

