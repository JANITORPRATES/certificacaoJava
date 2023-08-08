package scr.OCPGUIACOMPLETO.outro;

public class Polimorfismo {

	public static void main(String[] args) {
		Penguin penguin = new EmperorPenguin();
				penguin.printInfo();
				
		Penguin2 penguin2 = new CrestedPenguin();
		penguin2.printInfo();
		
		System.out.println(CrestedPenguin.getHeight());
		System.out.println(Penguin2.getHeight());

	}

}

class Penguin {
	   public int getHeight() { return 3; }
	   public void printInfo() {
	      System.out.println(this.getHeight());
	   }
	}
	 
	 class EmperorPenguin extends Penguin {
	   public int getHeight() { return 8; }
	   
	}
	 
	 class Penguin2 {
		   public static int getHeight() { return 3; }
		   public void printInfo() {
		      System.out.println(this.getHeight());
		   }
		}
		 class CrestedPenguin extends Penguin2 {
		   public static int getHeight() { return 8; }
		   
		}

