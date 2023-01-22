package scr.ALURA.Banco;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta1 primeiraConta = new Conta1();
		primeiraConta.deposita(400);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);;
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta1 segundaConta = primeiraConta;
		segundaConta.deposita(50);
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

	}

}
