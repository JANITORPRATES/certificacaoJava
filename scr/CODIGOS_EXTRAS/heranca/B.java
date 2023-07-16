package scr.CODIGOS_EXTRAS.heranca;

public class B extends A3 {

	String variavel = "Classe filho - B";
	static void metodo() {
		System.out.println("metodo static na classe B");
	}
	
	 void metodo2() {
			System.out.println("metodo NÃO static na classe B " + variavel);
		}
	
}
