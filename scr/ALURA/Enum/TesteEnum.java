package scr.ALURA.Enum;

public class TesteEnum {

	public static void main(String[] args) {

		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(Prioridade.MIN.getValor());
		System.out.println(pMax.getValor());

	}

}
