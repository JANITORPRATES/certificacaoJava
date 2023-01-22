package scr.ALURA.Excecoes;

public class TesteSaca3 {

    public static void main(String[] args) {
        Conta3 conta = new ContaCorrente3(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(conta.getSaldo());
    }
}
