package scr.ALURA.Enum;

public enum Prioridade {
	//0   1     2
	MIN(1),NORMAL(5),MAX(10);
	
	private int valor;
	
	Prioridade(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}

}
