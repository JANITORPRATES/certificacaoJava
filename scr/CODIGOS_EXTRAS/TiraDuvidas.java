package scr.CODIGOS_EXTRAS;

public class TiraDuvidas {
	
	public static void main(String[] parametros){
		
		int a = 1;
//		int b = 3;
		
		if(a > 0) {
			int b = 5;
		}
		
		int b = 9;
		
		System.out.println("o valor de b " + b);
		
		String s1 = "teste";
		String s2 = "teste";
		String s3 = new String(s1);//passou a referência do objeto "teste" e cria uma cópia no HEAP
		String s4 = new String("teste");//forçando a criar um novo objeto String
		
		//retorna true porque os 2 estão apontando para o mesmo objeto "teste" que está no pool de String
		System.out.println("s1 == s2 " + (s1 == s2)); 
		
		//retorna false porque s4 e s3 cria um novo objeto no HEAP
		System.out.println("s1 == s3 " + (s1 == s3));
		System.out.println("s1 == s4 " + (s1 == s4)); 
		System.out.println("s3 == s4 " + (s3 == s4));
		System.out.println("s3 Equals s4 " + (s3.equals(s4)));

		Extras testando = new Extras();
		testando.teste = 2;
		
		System.out.println(s1 == testando.s5);//retorna true porque o java só cria um objeto no pool de String caso ainda não exista
		
		TiraDuvidas teste2 = new TiraDuvidas();
		
		int[] frequencia = new int[3];
		frequencia[0] = 0;
		frequencia[1] = 1;
		frequencia[2] = 2;
		int i = 0;
		
		int absurdoMaisFunciona = 0;
		absurdoMaisFunciona = absurdoMaisFunciona = 2;
		System.out.println("uma atribuição que recebe outra atribuição: " + absurdoMaisFunciona);
		
		System.out.println(i);
		frequencia[++i] = 5;
		System.out.println(frequencia[0]);
		System.out.println(frequencia[1]);
		
		System.out.println("o valor de i " + i);
		
		System.out.println(frequencia[i]);
		System.out.println(frequencia[i++]);
		System.out.println(frequencia[i]);
		
	
		System.out.println("HelloWorld");
	}
}