package scr.OCPGUIACOMPLETO.outro;

import java.util.List;

class Primate {
	
	Object b = Integer.valueOf(9);
	   public boolean hasHair() {
	      return true;	   }
	}
	 
	 interface HasTail {
	   public abstract boolean isTailStriped();	}
	 
	public class Lemur extends PandaTeste implements HasTail {
		
		Integer b = 3;
		
	   public boolean isTailStriped() {
	      return false;
	   }
	   static void friendly(List<String> laugh,
			   Iterable<Short> s) {}
	   
	   public int age = 10;
	   public static void main(String[] args) {
		   
	      Lemur lemur = new Lemur();
	      System.out.println(lemur.age); //10
	      
	 
	      HasTail hasTail = lemur;
	      System.out.println(hasTail.isTailStriped());//false
	 
	      //Primate primate = lemur;
	      //System.out.println(primate.hasHair()); //true

	      System.out.println("é Lemur " + (lemur instanceof Lemur));
	     // System.out.println("é Lemur " + (lemur instanceof Primate));
	      System.out.println("é Lemur " + (lemur instanceof HasTail));
	      System.out.println("é Lemur " + (lemur instanceof List));//interface funciona
	      //System.out.println("é Panda " + (lemur instanceof PandaTeste));
	   }
	}
	
	class PandaTeste{
		{age = 5;}
		final int age;
		static void friendly(List<String> laugh,
				Iterable<Short> s) {}
	}
