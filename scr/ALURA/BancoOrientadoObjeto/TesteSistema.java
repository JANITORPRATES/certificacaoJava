package scr.ALURA.BancoOrientadoObjeto;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		
		Autenticavel referenciaGerente = new Gerente();

		Autenticavel referenciaCliente = new Cliente();

		Autenticavel referenciaAdministrador = new Administrador();
		
		si.autentica(referenciaCliente);
		si.autentica(referenciaAdministrador);
		si.autentica(referenciaGerente);

	}
}
