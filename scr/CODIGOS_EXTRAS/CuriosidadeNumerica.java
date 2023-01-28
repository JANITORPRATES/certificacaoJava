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
		
		System.out.println(limiteMaximoUltrapassado);//Imprime o próximo valor a partir do mínimo
		
		
		double d1 = 123.4;
		double d2 = 1.234e2;//mesmo valor de d1, mas em notação ciêntifica 1,234 x 10²
		float f1 = 123.4f;
		float f2 = 1.234e2f;//float também pode usar notação ciêntifica
		
		System.out.println(d1==d2);//retorna true
		
		int valorDecimal = 26;
		int valorHexadecimal = 0x1a;//começa com zero xis
		int valorOctal = 032; //começa com zero
		int valorBinario = 0b11010;//começa com zero bê
		
		
		long numeroCartaoCredito = 1234_5678_9012_3456L;
		long cpf = 101_134_156_68l;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffl;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_101010;
		
		/*
		//Não pode colocar underscore perto de ponto
		float pi1 = 3_.1415f;
		float pi2 = 3._1415f;
		
		//Não pode colocar underscore perto de sufixos (L)
		long cpf = 101_134_156_68_L;
		
		//isso é um identificador e não um literal
		int x1 = _52;
		
		//OK (decimal literal)
		int x2 = 5_2;
		int x = 5____________2;
		
		//Não pode colocar underscore no final de um literal
		int x3 = 52_
		
		
		//Não pode colocar underscore perto de prefixos (0x)
		int x5 = 0_x52;
		
		
		//Não pode colocar underscore no começo e nem no final de números
		int x6 = 0x_52;
		int x8 = 0x52_;
		
		
		//OK (hexadecimal literal)
		int x7 = 0x5_2;
		
		*/
		
		int outubro31 = 031; //25 representado em octal
		int dezembro25 = 25;
		
		System.out.println(outubro31 == dezembro25); //retorna true
	}

}
