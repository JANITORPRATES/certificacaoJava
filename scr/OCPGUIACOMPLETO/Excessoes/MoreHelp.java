package scr.OCPGUIACOMPLETO.Excessoes;

public class MoreHelp {
	class Sidekick implements AutoCloseable {
		public void close() {System.out.println("close");}}//2�

	public void requiresAssistance() {
		try (Sidekick is = new Sidekick()) {
			System.out.println("try"); // 1�
			 throw new RuntimeException();
		} catch(RuntimeException e ) {
			System.out.println("catch");// 3�
		}finally {
			System.out.println("finally");
		}
	}

	public static void main(String... league) {
		new MoreHelp().requiresAssistance();
		System.out.println("main");//ultimo
	}
}
