package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_CuentaCorriente {

	@Test 		//compruebo que extraiga saldo
	public void testQueExtraeAhorroConAdicional(){ 		
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(); //llamo a subclase cuenta sueldo 
				
		miCuentaCorriente.extraerEnDescubierto(800.0);		
		miCuentaCorriente.saldoDisponible(); //consulto saldo
	
		miCuentaCorriente.extraerEnDescubierto(475.0); //extraccion en descubierto
		miCuentaCorriente.saldoDisponible(); //se cobra adicional
	
	}


}
