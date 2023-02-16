package scr.CODIGOS_EXTRAS;

class A2 {
	
	final String n;
	
	A2(){
		n = "aprendendo";
		a();
		//n = "aprendendo";
	}
	
	void a() {
		System.out.println("Metodo a da super");
	}

}

class Construtores extends A2{
	void a() {
		System.out.println(n.length());
		System.out.println("Metodo a dentro da subClasse");
	}
	
	public static void main(String[] args) {
		
		new Construtores();
		metodo2();
	}
	
	static void metodo (int[] args) {
		System.out.println("Não funciona sem argumentos");
	}
	
	static void metodo3 (String[] args) {
		System.out.println("Não funciona sem argumentos");
	}
	
	static void metodo2 (int... args) {
		System.out.println("funciona sem argumentos");
	}
	
	
}
