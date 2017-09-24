package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta { //testeo cuenta padre

	@Test
	public void testQueDeposita(){		//compruebo que deposite saldo
		
		Cuenta cuenta = new Cuenta();
		cuenta.saldoDisponible();	

		cuenta.despositar(1500.0);
		cuenta.saldoDisponible();
	}
	
	@Test 
	public void testQueExtrae(){ 		//compruebo que extraiga saldo
		Cuenta cuenta = new Cuenta();
		cuenta.extraer(400.0);
		cuenta.saldoDisponible();
	}
	
	@Test 
	public void testOperacionesEnCuenta(){ //operacion completa deposito, extraccion,consulta
		
		Cuenta cuenta = new Cuenta();	 //se llama al constructor
		
		cuenta.despositar(4000.0); 		//se deposita 
		Double saldo = cuenta.getDineroEnCuenta();
		
		cuenta.extraer(300.0); 			//se hace una primera extraccion 
		saldo = cuenta.getDineroEnCuenta();
		
		//cuenta.extraer(5000.0);			//se pide segunda extraccion, donde no sera sufiente el saldo 
		
		cuenta.saldoDisponible(); 		//se consulta saldo en cuenta
	}



}
