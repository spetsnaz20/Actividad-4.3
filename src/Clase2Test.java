import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Clase2Test {

	@Test
	void testMedia() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		double resultado = clase2.metodo(numeros);
		assertEquals(15, resultado);
	}
	
	@Test
	void sumaCero() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0);
		double resultado = clase2.metodo(numeros);
		assertEquals(0, resultado);
	}

}
