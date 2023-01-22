package scr.ALURA.Excecoes;

public abstract class Conta3 {
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta3(int agencia, int numero) {
		
		this.agencia = agencia;
		this.numero = numero;
		
	}
	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void saca(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 

        this.saldo -= valor;       
}
	
	public void transfere(double valor, Conta3 destino) throws SaldoInsuficienteException{
	    this.saca(valor);
	    destino.deposita(valor);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

}
