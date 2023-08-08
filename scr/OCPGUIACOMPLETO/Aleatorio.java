package scr.OCPGUIACOMPLETO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.callback.TextOutputCallback;

public class Aleatorio {
	static int x;
	int y = 0;
	String texto;
	{
		int y;
	}
	

static {
	System.out.println("bloco estatico");
	x = 5;
	
	
}
	
	public static void main(String[] args) {
		
		Integer numeroxxx = Integer.valueOf(5);
		String numero2 = "5";
		int numero55 = 5;
		
		System.out.println(numeroxxx.equals(numero55));
		int participants = 4, animals = 2, performers = -1;
		   
	     while((participants = participants+1) < 10) {}
	     do {} while (animals++ <= 1);
	     for( ; performers<2; performers+=2) {}
	   
	     System.out.println(participants);
	     System.out.println(animals);
	     System.out.println(performers);	
		
		Aleatorio Public = new Aleatorio();
		int a = 2, b = 4, c = 2;
		System.out.println("--------------------------------- ");
		System.out.println("valor de b " + b);
		  System.out.println(a > 2 ? --c : b++);
		  System.out.println("valor de b " + b);
		  System.out.println(b = (a!=c ? a : b++));
		  System.out.println("valor de b " + b);
		  System.out.println("--------------------------------- ");  
		Integer numero = Integer.valueOf(10);
		var g = 5.0;
		g = numero;
		short j = 5000;
		
		var var = "85";
	
			
		System.out.println("dentro de main");
		boolean wednesday = 1 > 2 ? !true: true;
		short thursday = (short)Integer.MAX_VALUE;
		
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);//adiciona sempre no final
		//System.out.println(lista);
		
		int[] array = {6,9,8};
	    List<Integer> list = new ArrayList<>();
	    list.add(array[0]);
	    list.add(array[2]);
	    list.set(1, array[1]);
	    list.remove(0);
	    System.out.println(list);
	    System.out.println("C" + Arrays.compare(array, 
	       new int[] {6, 9, 8}));
	    System.out.println("M" + Arrays.mismatch(array, 
	       new int[] {6, 9, 8}));
	    
	    
	    final int score1 = 8, score2 = 3;
	    byte myScore;
	    myScore = 7 - 1;
	    switch (myScore) {
	    default:
	    case score1:
	    case 2:
	    case 6: System.out.print("great-");
	    case 4: System.out.print("good-"); break;
	    case score2:
	    case 1:
	    	System.out.print("not good-");
	    }
	    float xxxx = 5L;
	    
	}
	
	static int metodoPosIncremento(int valorOriginal) {
		int novoValor = valorOriginal + 1;
		return valorOriginal;
	}
	
	static int metodoPreIncremento(int valorOriginal) {
		int novoValor = valorOriginal + 1;
		return novoValor;
	}
	


}
