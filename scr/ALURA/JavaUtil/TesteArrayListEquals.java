package scr.ALURA.JavaUtil;

import java.util.ArrayList;

import scr.ALURA.BancoOrientadoObjeto.Contas.Conta;
import scr.ALURA.BancoOrientadoObjeto.Contas.ContaCorrente;

public class TesteArrayListEquals {

        public static void main(String[] args) {
        	
//        	Conta cc1 = new ContaCorrente(22, 22);
//            Conta cc2 = new ContaCorrente(22, 22);
//
//            boolean igual = cc1.ehIgual(cc2);
//            System.out.println(igual);

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);        
        boolean existe = lista.contains(cc3); //Usa o m�todo equals

        System.out.println("J� existe? " + existe);
        
//        for(Conta conta : lista) {
//            if(conta.ehIgual(cc3)) {
//                    System.out.println("J� tenho essa conta!");
//            }
//    }
    }
}
