package scr.OCPGUIACOMPLETO.Excessoes;

public class MoreHelp {
	class Sidekick implements AutoCloseable {
		public void close() {System.out.println("close");}}//2º

	public void requiresAssistance() {
		try (Sidekick is = new Sidekick()) {
			System.out.println("try"); // 1º
			 throw new RuntimeException();
		} catch(RuntimeException e ) {
			System.out.println("catch");// 3º
		}finally {
			System.out.println("finally");
		}
	}

	public static void main(String... league) {
		new MoreHelp().requiresAssistance();
		System.out.println("main");//ultimo
	}
}
