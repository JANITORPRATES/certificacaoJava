package scr.ALURA.Banco;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaJanitor = new Conta();
		Conta contaPalloma = new Conta();
		
		contaJanitor.setTitular(new Cliente());
		contaJanitor.getTitular().setNome("Janitor");
		
		contaJanitor.deposita(100);
		contaPalloma.deposita(1000);
		
		System.out.println("Saldo conta Janitor " + contaJanitor.getSaldo());
		System.out.println("Saldo conta Palloma " + contaPalloma.getSaldo());
		
		contaPalloma.saca(200);
		contaJanitor.saca(20);
		
		System.out.println("Saldo conta Janitor " + contaJanitor.getSaldo());
		System.out.println("Saldo conta Palloma " + contaPalloma.getSaldo());
		
		
		boolean transferenciaOk = contaPalloma.transfere(300, contaJanitor);
		
		if(transferenciaOk) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente para transferência!");
		}
		
		System.out.println("Saldo conta Janitor " + contaJanitor.getSaldo());
		System.out.println("Saldo conta Palloma " + contaPalloma.getSaldo());
			

	}

}
