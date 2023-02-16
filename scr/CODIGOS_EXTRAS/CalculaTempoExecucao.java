package scr.CODIGOS_EXTRAS;

public class CalculaTempoExecucao {
	
	public static void main(String[] args) {
		
		String strFinal = "";
		
		long tStart = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			strFinal += "a";
		}
		
		long tEnd = System.currentTimeMillis();
		long tResultado = tEnd - tStart;
		
		System.out.println("Tempo de execução com o operador '+' = " + tResultado + " ms");
		
		
		
		StringBuilder strBuilder = new StringBuilder();
		String teste = strBuilder.toString();
		
		long tStart1 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			strBuilder.append("a");
		}
		
		long tEnd1 = System.currentTimeMillis();
		long tResultado1 = tEnd1 - tStart1;
		
		System.out.println("Tempo de execução com o StringBuilder = " + tResultado1 + " ms");
		
	}
}
