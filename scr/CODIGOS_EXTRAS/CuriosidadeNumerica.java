package scr.CODIGOS_EXTRAS;

public class CuriosidadeNumerica {
	
	
	/*
	 * 	Tipo		Tamanho		Valor
	 *	byte		8 bits		-128 a 127
	 *	short		16 bits		-32.768 a 32.767
	 *	int			32 bits		-2.147.483.648 a 2.147.483.647
	 *	long		64 bits		-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
	  */
	

	public static void main(String[] args) {
		

		int tamanhoMaximo = 2147483647;
		int valor = 1;
		int limiteMaximoUltrapassado = tamanhoMaximo + valor;
		
		System.out.println(limiteMaximoUltrapassado);//Imprime o pr�ximo valor a partir do m�nimo
		
		
		double d1 = 123.4;
		double d2 = 1.234e2;//mesmo valor de d1, mas em nota��o ci�ntifica 1,234 x 10�
		float f1 = 123.4f;
		float f2 = 1.234e2f;//float tamb�m pode usar nota��o ci�ntifica
		
		System.out.println(d1==d2);
	}

}
