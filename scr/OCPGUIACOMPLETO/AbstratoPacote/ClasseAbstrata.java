package scr.OCPGUIACOMPLETO.AbstratoPacote;

abstract class Bear {
	abstract CharSequence chew();

	public Bear() {
		System.out.println("construtor classe pai");
		System.out.println(chew()); // Does this compile?
	}
}

public class ClasseAbstrata extends Bear {
	
	ClasseAbstrata (){
		System.out.println("construtor classe filha");
	}
	String chew() {
		return "yummy!";
	}
	
	
	private static void metodo() {
		
	}

	public static void main(String[] args) {
		new ClasseAbstrata();
		metodo();
	}
}
