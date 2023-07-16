package scr.OCPGUIACOMPLETO;

interface HasTail { int getTailLength(); }
   class Puma implements HasTail {
     public int getTailLength() { return 4; }
  }
  public class Cougar implements HasTail {
     public static void main(String[] args) {
        var puma = new Puma();
        
        System.out.println(puma.getClass());
        System.out.println(puma instanceof Puma );
        System.out.println(puma.getTailLength());
     }
    public int getTailLength() { return 2; }
 }
