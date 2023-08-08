package scr.OCPGUIACOMPLETO.outro;

public class BirdSeed {
private int numberBags;
boolean call;
public BirdSeed() {
// LINE 1
	new BirdSeed(2);
call = false;
// LINE 2
}
public BirdSeed(int numberBags) {
this.numberBags = numberBags;
}
public static void main(String[] args) {
BirdSeed seed = new BirdSeed();
System.out.print(seed.numberBags);
} }