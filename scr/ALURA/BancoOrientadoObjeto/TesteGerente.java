package scr.ALURA.BancoOrientadoObjeto;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		
		g1.setNome("Anilton");
		g1.setCpf("2121212121212");
		g1.setSalario(20000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(22222);
		boolean autenticou = g1.autentica(22222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
