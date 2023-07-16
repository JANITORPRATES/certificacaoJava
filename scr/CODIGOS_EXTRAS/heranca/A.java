package scr.CODIGOS_EXTRAS.heranca;

class A3 {
	
	public static char[] x;
	String variavel = "Classe pai - A";

	static void metodo() {
		System.out.println("metodo static na classe A");
	}
	
	 void metodo2() {
		System.out.println("metodo NÃO static na classe A " + variavel);
	}
}






class B2 {
    int x = 1;
    
    public String retornoX() {
    	System.out.println("Metodo dentro de B2");
    	return "valor de x dentor de B2 " + x;
    }
}
class A extends B2 {
    static int x = 2;
    public static void main(String[] args) {
    	
    	B2 b = new A();
        System.out.println("O atributo vem da classe mãe " + b.x);
        //b.retornoX();
        System.out.println(b.retornoX());
    }
    
    public String retornoX() {
    	System.out.println("Metodo dentro de A");
    	return "valor de x dentor de A " + x;
    }
}

