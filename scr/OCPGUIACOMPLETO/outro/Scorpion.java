package scr.OCPGUIACOMPLETO.outro;

class Arachnid {
 static StringBuilder sb = new
StringBuilder();
 public Arachnid(){
	 System.out.println("construtor pai");
 }
 
 {System.out.println("inicializador pai");}
 { sb.append("c"); }
 static
 { sb.append("u"); }
 { sb.append("r"); }
 }
 public class Scorpion extends Arachnid {
 static
 { sb.append("q"); }
 
 public Scorpion(){
	 System.out.println("construtor filho");
 }
 { sb.append("m"); }
 {System.out.println("inicializador filho");}
 public static void main(String[] args) {
	new Scorpion();
// System.out.print(Scorpion.sb + " ");
// System.out.print(Scorpion.sb + " ");
// new Arachnid();
// new Scorpion();
// System.out.print(Scorpion.sb);
 } }
