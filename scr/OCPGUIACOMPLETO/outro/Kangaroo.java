package scr.OCPGUIACOMPLETO.outro;

class Marsupial {
	protected int age = 2;

	private void metodo() {
		System.out.println("classe pai");
	}
	public static boolean isBiped() {
		return false;
	}
}

public class Kangaroo extends Marsupial {
	protected int age = 6;

	public void metodo() {
		System.out.println("classe filha");
	}
	public static boolean isBiped() {
		return true;
	}

	public static void main(String[] args) {
		
		Kangaroo joey = new Kangaroo();
		joey.metodo();
		Marsupial moey = joey;
		System.out.println(joey.isBiped());//true é igual Kangaroo.isBiped
		System.out.println(moey.isBiped());//false é igual Marsupial.isBiped
		System.out.println(joey.age);//6 é igual Kangaroo.isBiped
		System.out.println(moey.age);//2 false é igual Marsupial.isBiped
	}
}
