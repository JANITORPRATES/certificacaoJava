package scr.CODIGOS_EXTRAS;

public class TesteEstudos {

	public TesteEstudos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a = Integer.parseInt("1000");
		int soma = a + a;
		//System.out.println(1 == 100.0 / 100.0);
        char c = 10;
        //short s = c;
        int i1 = 3/2;
        double i2 = 3/2;
        double i3 = 3/2.0;

        long x = 0;
        double d = 0;
        double zero = x + d;
        //System.out.println(i1 + i2 + i3 + x + d + zero);
        
        //System.out.println(3 / 0);
        //System.out.println(3 / 0.0);
        //System.out.println(3.0 / 0);
        //System.out.println(-3.0 / 0);
        
       
                int $$ = 5;
                int __ = $$++;
                //if (__ < ++$$ || __-- > $$)
                    //System.out.print("A");

                //System.out.print($$);
                //System.out.print(__);
     

        int i;
        for (i = 0; i < 5; i++) {
        	System.out.println("i dentro do for " + i);
            if (++i % 3 == 0) {
                break;
            }
        }
        //System.out.println(i);
        
        //System.out.println(0%3);
        
        
        char c3 = 65;
        char c2 = 68 - 65;
        c2 = 68;
        //System.out.println(c3 + c2);
        //System.out.println(c2);
 
        String texto = "Um tEXTO qualquer";
        //System.out.println(texto.toLowerCase()== texto);
        

String h = new String ("hello ");
String h1 = "hello ";
String w = "world";
/*
System.out.println("hello ");        
System.out.println(h1 + "world");    
System.out.println("Hello " == h1);
System.out.println("hello " == h1);*/

String s1 = "s1";
String s2 = s1.substring(0, 1) + s1.substring(1,1);

System.out.println(s1.substring(1,2));
System.out.println(s2);
System.out.println(s1==s2);
System.out.println(s1.equals(s2));

	}
	
	 

}
