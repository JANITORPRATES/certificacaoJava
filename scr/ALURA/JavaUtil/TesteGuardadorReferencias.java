package scr.ALURA.JavaUtil;

import scr.ALURA.BancoOrientadoObjeto.Contas.Conta;
import scr.ALURA.BancoOrientadoObjeto.Contas.ContaCorrente;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta)guardador.getReferencia(0);
        System.out.println(ref.getNumero());        
    }
}
