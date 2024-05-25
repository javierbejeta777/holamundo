package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import holamundo.Dividir;
import holamundo.Multiplicar;
import holamundo.Resta;
import holamundo.Sumar;

public class Calculadora {
	
	@Test
	public void sumar() {
		assertEquals(4, Sumar.suma(2, 2));
	}
	
	@Test
	public void restar() {
		assertEquals(0, Resta.resta(2, 2));
	}
	
	@Test
	public void multiplicar() {
		assertEquals(8, Multiplicar.Multiplicar(4, 2));
	}
	
	@Test
	public void dividir() {
		assertEquals(2, Dividir.Division(4, 2));
	}

}
