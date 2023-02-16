package scr.CODIGOS_EXTRAS.heranca;

public class TestaHeranca {

	public static void main(String[] args) {
		new B().metodo();
		B.metodo();
		A.metodo();
		
		new B().metodo2();
		
		new TestaHeranca().naoStatic();;
	}
	
	public void naoStatic() {
		new B().metodo();
		B.metodo();
		A.metodo();
	}

}
