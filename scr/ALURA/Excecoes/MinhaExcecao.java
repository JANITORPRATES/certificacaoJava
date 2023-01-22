package scr.ALURA.Excecoes;

//uncheck - não verificada pelo compilador
public class MinhaExcecao extends RuntimeException {
    public MinhaExcecao(String msg) {
        super(msg);
    }
}



//check - verificada pelo compilador
//public class MinhaExcecao extends Exception {
//  public MinhaExcecao(String msg) {
//      super(msg);
//  }
//}