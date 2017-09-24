package ar.edu.unlam.pb2;

public class CuentaSueldo extends Cuenta{
	
	//no tiene atributos propios de la subclase
	
	//constructor
	
	public CuentaSueldo(){ //vacio
		super();
	}
	public CuentaSueldo(Double dineroEnCuenta){ //con parametros
		super(dineroEnCuenta);
	}
	
	//metodos
	
		//para extraer dinero
	public void extraerSueldo(Double extraer){
		Double saldo;
		if (this.getDineroEnCuenta() >= extraer){ 	//si tengo dinero suficente extrae
			saldo = this.getDineroEnCuenta()-extraer;
			setDineroEnCuenta(saldo);
		}
		else{
			System.out.println("No puede extraer("+extraer+"). Saldo insuficiente.");//para mostrar en pantalla
		}
	}

}
