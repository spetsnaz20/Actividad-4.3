import java.util.ArrayList;

public class Clase1 {

	public static void main(String[] args) {

	}
	
	 public static void terminaEnTres (ArrayList<Integer> nEnteros) {
	        for(int i = 0; i<nEnteros.size(); i++) {
	            if(nEnteros.get(i)%10 == 3) {
	                System.out.println(nEnteros.get(i) + " acaba en 3");
	            }
	        }
	    
	}

}
