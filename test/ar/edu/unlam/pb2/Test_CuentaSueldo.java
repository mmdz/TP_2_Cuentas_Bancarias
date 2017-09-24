package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import javax.annotation.Generated;

import org.junit.Test;

public class Test_CuentaSueldo { //si el saldo es menor a la extraccion pedida, no se completa la operacion


	
	@Test 		//compruebo que extraiga saldo
	public void testQueExtraeSueldo(){ 		
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(); //llamo a subclase cuenta sueldo 
		miCuentaSueldo.extraerSueldo(450.0);
		miCuentaSueldo.saldoDisponible(); //quedan 550$
	}
	
	@Test		//no permite extraccion 
	public void testDeSaldoInsuficiente(){
		CuentaSueldo miCuentaSueldo = new CuentaSueldo();
		miCuentaSueldo.extraerSueldo(2450.0);
		miCuentaSueldo.saldoDisponible(); //quedan $1000
	}
	
	@Test
	public void testQueDepositaSueldo(){		//compruebo que deposite saldo
		
		CuentaSueldo miCuentaSueldo = new CuentaSueldo();
		miCuentaSueldo.despositar(8000.0);
		miCuentaSueldo.saldoDisponible(); //quedan $9000
	}
	
	@Test 
	public void testOperacionesEnCuentaSueldo(){ //operacion completa deposito, extraccion,consulta
		
		CuentaSueldo miCuentaSueldo = new CuentaSueldo();	 //se llama al constructor
		
		miCuentaSueldo.despositar(4000.0); 		 
		Double saldo = miCuentaSueldo.getDineroEnCuenta(); //quedan $5000
		
		miCuentaSueldo.extraerSueldo(300.0); 			//se hace una primera extraccion, quedan $4700 
		saldo = miCuentaSueldo.getDineroEnCuenta(); 
		
		miCuentaSueldo.extraerSueldo(7000.0);			//se pide segunda extraccion, donde no sera sufiente el saldo 
		
		miCuentaSueldo.despositar(1000.0);
		miCuentaSueldo.saldoDisponible(); //consulta saldo
		
		miCuentaSueldo.extraerSueldo(2000.0);
		
		miCuentaSueldo.saldoDisponible(); 		//se consulta saldo en cuenta
	}

}
