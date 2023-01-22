package scr.ALURA.Excecoes;

public class TesteContas3 {

    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente3 cc = new ContaCorrente3(111, 111);
        cc.deposita(1000.0);

        ContaCorrente3 cc2 = new ContaCorrente3(111, 111);
        cc.transfere(110.0, cc2);

        System.out.println("CC: " + cc2.getSaldo());
    }
}
