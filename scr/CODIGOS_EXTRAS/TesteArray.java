package scr;

import java.util.*;
import java.util.Collection;
import java.util.Iterator;

public class TesteArray {

	public TesteArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Janitor");
		nomes.add("Palloma");
		
		String[] arrayNomes = nomes.toArray(new String[nomes.size()]);
		

	    Collection<String> strings = new ArrayList<String>();
	    Iterator<String> iterator = strings.iterator();
	    while (iterator.hasNext()) {
	        String atual = iterator.next();
	        System.out.println(atual);
	    }
        
	    ArrayList<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add(1,"amor");
        l.add(3,"baixinho");
        System.out.println(l);
        //String[] array =  l.toArray();
        //System.out.println(array[2]);
        
        List lista = new ArrayList<>();
        lista.add("nomeA");
        lista.add("nomeB");
        lista.add("nomeC");
        lista.add("nomeB");
        //lista.clear();
        lista.remove(2);
        System.out.print(lista);
        

	}

}
