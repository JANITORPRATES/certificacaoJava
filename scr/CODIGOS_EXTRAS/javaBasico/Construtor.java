package scr.CODIGOS_EXTRAS.javaBasico;

public class Construtor {
	
	int x = 3;
	
	{
		System.out.println("valor de x " + x);
		x = 1;
		System.out.println("valor de x 2º bloco " + x);
	}
	
	{
		System.out.println("bloco de inicialização " + x);
	}
		
	
	
	Construtor(){
		System.out.println("valor de x no construtor " + x);
	}

}
