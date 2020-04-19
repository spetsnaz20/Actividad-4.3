import java.util.ArrayList;

public class clase2 {
	public static void main (String []args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
	}
	public void metodo(ArrayList<Integer>numeros) {
		int suma=0;
		for(int i=0;i<numeros.size();i++) {
		suma = suma+ numeros.get(i);
		}
		suma/=numeros.size();
		
	}

}
