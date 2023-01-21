package scr.ALURA.Banco;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(400);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);;
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(50);
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

	}

}
