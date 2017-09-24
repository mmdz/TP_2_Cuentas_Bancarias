package ar.edu.unlam.pb2;

public class Cuenta { //se crea clase padre (superclase)
	
	//atributos
	protected Double dineroEnCuenta; //si es protected puede modificarlo el hijo
	
	//constructor
	public Cuenta(){
		this.dineroEnCuenta = 1000.0; //inicia cuenta con $1000
	}
	
	public Cuenta(Double dineroEnCuenta){ //con parametros
		this.dineroEnCuenta = dineroEnCuenta;
	}

	//metodos
	
	public void despositar(Double depositar){ //para depositar dinero
		this.dineroEnCuenta += depositar;
	}
		
	public void extraer(Double extraer){	//para extraer dinero
		this.dineroEnCuenta -= extraer;
	}
	
	public void saldoDisponible(){ 			//para conocer saldo
		System.out.println("Saldo Disponible: "+this.getDineroEnCuenta());//muestra el saldo en pantalla
	}

	
	//getter y setter
	public Double getDineroEnCuenta() {
		return dineroEnCuenta;
	}

	public void setDineroEnCuenta(Double dineroEnCuenta) {
		this.dineroEnCuenta = dineroEnCuenta;
	}
	
	
	
}
