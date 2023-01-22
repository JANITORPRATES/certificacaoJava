package scr.ALURA.Excecoes;

public class ContaCorrente3 extends Conta3 {
	
	public ContaCorrente3(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
	    double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}
}
