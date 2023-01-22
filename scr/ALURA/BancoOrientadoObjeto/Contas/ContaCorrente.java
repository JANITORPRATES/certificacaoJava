package scr.ALURA.BancoOrientadoObjeto.Contas;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
	super(agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double valorAASacar = valor + 0.2;
		return super.saca(valorAASacar);
	}
}
