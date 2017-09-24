package ar.edu.unlam.pb2;

public class CajaAhorro extends Cuenta{ //caja ahorro hereda de cuenta
	
		//atributos propios de subclase
	private Integer cantidadExtracciones; //dsp de la 5 extraccion se cobra
	private final Double adicional = 6.0; //declaro constante  

	//constructor
	
	public CajaAhorro(){ //vacio
		super();
		cantidadExtracciones = 0;
	}
	
	public CajaAhorro(Double dineroEnCuenta){ //con parametros
		super(dineroEnCuenta);
		this.cantidadExtracciones = 0;
	}
	
	//metodos 
	
	
	public void extraerAhorro(Double extraerAhorro){
		Double plata;
		//Integer contador=0;
			//si tengo dinero suficente extrae
			if (this.getDineroEnCuenta() >= extraerAhorro){ 	
				plata = this.getDineroEnCuenta()-extraerAhorro;
				setDineroEnCuenta(plata);
				cantidadExtracciones++;
	
				//si supera las 5 extracciones se cobra adicional
					while(cantidadExtracciones==5){
					plata= getDineroEnCuenta()-adicional;
					setDineroEnCuenta(plata);
					cantidadExtracciones=0;
					}
			}
			else{
				System.out.println("No puede extraer("+extraerAhorro+"). Saldo insuficiente.");//para mostrar en pantalla
			}
	
		}
			
	//getter y setter 
	public Integer getCantidadExtracciones() {
		return cantidadExtracciones;
	}

	public void setCantidadExtracciones(Integer cantidadExtracciones) {
		this.cantidadExtracciones = cantidadExtracciones;
	}
	
}//fin de subclase
	
