package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {
	CuentaBancaria cuenta;
	
	@BeforeEach
	void setup() throws Exception {
		cuenta = new CuentaBancaria(1000);
	}
	
	/**
	 * Pruebas del contructor
	 */
	@Test
	@DisplayName ("Prueba donde el saldo inicial es correcto")
	void testConstructorValido() {
		double resultadoEsperado = 1000.0;
		assertEquals(resultadoEsperado , cuenta.getSaldo(), "No se corresponde el saldo obtenido con el pasado") ;
	}
	
	@Test
	@DisplayName ("Prueba donde el saldo inicial es negativo")
	void testConstructorNegativo() {
		String mensajeEsperado = "El saldo inicial no puede ser negativo.";
		Exception exception = assertThrows(IllegalArgumentException.class, ()-> new CuentaBancaria(-200));
		
		assertEquals(mensajeEsperado, exception.getMessage(), "El mensaje esperado no coincide con el obtenido");
	}
	
	/**
	 * Pruebas de metodos
	 */
	@Test
	@DisplayName("Prueba del metodo depositar")
	void testdepositarValido () {
		
		
	}

}
