package scr.codeWars;

public class DuplicateEncoder {

	public static void main(String[] args) {
		String teste1 = "Prespecialized"; 
		System.out.println (encode(teste1));
		System.out.println(teste1.equals(")()())()(()()("));
		
		System.out.println (encode("recede"));

	}
	
	static String encode(String word){
		word = word.toUpperCase();
	    
	    for(char a : word.toCharArray()){
	    	
	    }
	    for (char b : word.toCharArray())
	    	if(b != ')')
	    		word = word.replace(b,'(');
	    
	    return word;
	  }

}
