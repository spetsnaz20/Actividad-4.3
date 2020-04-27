import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Víctor Rodríguez
 * @author Eduardo González
 *
 */
public class clase2 {
	/**
	 * 
	 * @param args main
	 */
	
	public static void main (String []args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		boolean fin = false;
		String op = "";
		
		System.out.println("Introduce los numeros que quieras sacar la media:");
		while(fin == false) {
			System.out.print("Número:_");
			numeros.add(Integer.parseInt(sc.nextLine()));
			System.out.println("\n¿Quieres introducir más números?");
			System.out.println("1. Sí" + "\n2. No");
			op = sc.nextLine();
			switch(op) {
			case "1": 
				fin = false;
				break;
			case "2":
				fin = true;
			}
			
		}
		
		System.out.println(metodo(numeros));
		
	}
	/**
	 * 
	 * @param numeros guarda los numeros que se van a sumar en un Arraylist
	 * @return devuelve el total de la suma de los numeros
	 */
	
	public static double metodo(ArrayList<Integer>numeros) {
		double suma=0;
		
		if(numeros.get(0) > 0) {
			for(int i=0;i<numeros.size();i++) {
				suma = suma+ numeros.get(i);
				}
				suma/=numeros.size();
				System.out.println(suma);
		}else {
			suma = 0;
		}
		return suma;
	}

}
