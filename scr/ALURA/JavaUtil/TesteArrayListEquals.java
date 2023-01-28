package scr.ALURA.JavaUtil;

import java.util.ArrayList;

import scr.ALURA.BancoOrientadoObjeto.Contas.Conta;
import scr.ALURA.BancoOrientadoObjeto.Contas.ContaCorrente;

public class TesteArrayListEquals {

        public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        boolean existe = lista.contains(cc2);

        System.out.println("J� existe? " + existe);

        for(Conta conta : lista) {
                System.out.println(conta);
        }
    }
}
