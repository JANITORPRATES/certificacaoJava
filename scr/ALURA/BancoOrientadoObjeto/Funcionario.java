package scr.ALURA.BancoOrientadoObjeto;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

//	public double getBonificacao() {
//		System.out.println("Chamando o m�todo bonificacao do FUNCIONARIO");
//		return salario * 0.05;
//	}
	
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
