import java.util.ArrayList;
import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
				
		ArrayList<Integer> nEnteros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        String op = "";

        System.out.println("Introduce los numeros que quieras comprobar:");
        while(fin == false) {
            System.out.print("N�mero:_");
            nEnteros.add(Integer.parseInt(sc.nextLine()));
            System.out.println("\n�Quieres introducir m�s n�meros?");
            System.out.println("1. S�" + "\n2. No");
            op = sc.nextLine();
            switch(op) {
            case "1": 
                fin = false;
                break;
            case "2":
                fin = true;
            }

        }

       System.out.println(terminaEnTres(nEnteros));
    }
	
	
	 public static String terminaEnTres (ArrayList<Integer> nEnteros) {
	        for(int i = 0; i<nEnteros.size(); i++) {
	            if(nEnteros.get(i)%10 == 3) {
	                return nEnteros.get(i) + " acaba en 3";
	            }
	        }
	    return "ningun numero acaba en 3";
	}

}
