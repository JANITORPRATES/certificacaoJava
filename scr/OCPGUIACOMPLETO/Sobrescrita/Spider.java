package scr.OCPGUIACOMPLETO.Sobrescrita;

import java.util.ArrayList;
import java.util.List;

class Arthropod {
	protected void printName(int input) {
		System.out.print("long");
	}

	void printName(Object autoBox) {
		System.out.print("Spooky");
	}
	
	public void printName(List<String> texto) {
		System.out.println("List");
		
	}
}

public class Spider extends Arthropod {
	
	public void printName(ArrayList<Object> texto) {
		System.out.println("ArrayList");
		
	}
	
	protected void printName(int input) {
		System.out.print("int");
	}

	public static void main(String[] args) {
		Spider a = new Spider();
		 
	List objetos = new ArrayList<>();
	objetos.add(new Spider());
	objetos.add("texto");
	
	a.printName(objetos);//List
	
	
//	 a.printName((short)4);
	 a.printName((short) 5);
//	 a.printName(5L);
	 }
}
