package scr.CODIGOS_EXTRAS.javaBasico;

public class Construtor {
	
	int x = 3;
	
	{
		System.out.println("valor de x " + x);
		x = 1;
		System.out.println("valor de x 2� bloco " + x);
	}
	
	{
		System.out.println("bloco de inicializa��o " + x);
	}
		
	
	
	Construtor(){
		System.out.println("valor de x no construtor " + x);
	}

}
