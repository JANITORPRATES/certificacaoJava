package scr.CODIGOS_EXTRAS.heranca;

public class A {
	
	String variavel = "Classe pai - A";

	static void metodo() {
		System.out.println("metodo static na classe A");
	}
	
	 void metodo2() {
		System.out.println("metodo NÃO static na classe A " + variavel);
	}
}
