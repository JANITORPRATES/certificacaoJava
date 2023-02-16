package scr.CODIGOS_EXTRAS;

public class MetodoStatico {
	
	static int a(B b) {
		return 1;
	}
	
	static int a(D d) {
		return 2;
	}

	public static void main(String[] args) {
		System.out.println(a(new D()));

	}

}

class B {};
class D extends B{}

