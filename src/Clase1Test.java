import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Clase1Test {
	
	
	@Test
	void acabaen3() {
		ArrayList<Integer> nEnteros = new ArrayList<Integer>();
		nEnteros.add(3);
		String numeros=Clase1.terminaEnTres(nEnteros);
		assertEquals(nEnteros.get(0) + " acaba en 3",numeros);
	}
	@Test
	void noacabaen3() {
		ArrayList<Integer> nEnteros = new ArrayList<Integer>();
		nEnteros.add(4);
		String numeros=Clase1.terminaEnTres(nEnteros);
		assertEquals("ningun numero acaba en 3",numeros);
	}


}
