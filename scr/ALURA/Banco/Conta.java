package scr.ALURA.Banco;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}
