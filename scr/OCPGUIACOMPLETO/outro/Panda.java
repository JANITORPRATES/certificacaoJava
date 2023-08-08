package scr.OCPGUIACOMPLETO.outro;

public class Panda extends Bear {
	
	   public static void eat() {
	      System.out.println("Panda is chewing");
	   }
	   public static void main(String[] args) {
	      eat(); //Imprime Panda is chewing
	   }
	}

 class Bear {
	   public static void eat() {
	      System.out.println("Bear is eating");
	   }
	}