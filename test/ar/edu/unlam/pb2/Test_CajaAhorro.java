package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_CajaAhorro {

	@Test 		//compruebo que extraiga saldo
	public void testQueExtraeAhorroConAdicional(){ 		
		CajaAhorro miCajaAhorro = new CajaAhorro(); //llamo a subclase cuenta sueldo 
		
		miCajaAhorro.extraerAhorro(100.0);		
		miCajaAhorro.extraerAhorro(100.0);
		miCajaAhorro.saldoDisponible(); //consulto saldo

		miCajaAhorro.extraerAhorro(300.0);
		miCajaAhorro.extraerAhorro(10.0);
		miCajaAhorro.extraerAhorro(10.0);

		miCajaAhorro.saldoDisponible(); // se cobro adicional

		miCajaAhorro.extraerAhorro(10.0);
		miCajaAhorro.extraerAhorro(10.0);
		miCajaAhorro.extraerAhorro(10.0);
		miCajaAhorro.extraerAhorro(10.0);
		miCajaAhorro.extraerAhorro(10.0);
		
		miCajaAhorro.saldoDisponible(); //se cobra adicional
	}

	@Test
	public void testQueNoPermiteExtraccion(){
		CajaAhorro miCajaAhorro = new CajaAhorro();
		
		miCajaAhorro.extraerAhorro(1200.50);
		miCajaAhorro.saldoDisponible();
	}
}
