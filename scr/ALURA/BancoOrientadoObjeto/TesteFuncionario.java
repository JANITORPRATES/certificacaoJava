package scr.ALURA.BancoOrientadoObjeto;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario janitor = new Funcionario();
		
		janitor.setNome("Janitor Prates");
		janitor.setCpf("09877887778-9");
		janitor.setSalario(12000.00);
		
		System.out.println(janitor.getNome());
		System.out.println(janitor.getBonificacao());
		
		
		
		
	}

}
