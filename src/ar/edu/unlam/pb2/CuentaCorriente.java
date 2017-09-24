package ar.edu.unlam.pb2;

public class CuentaCorriente extends Cuenta{ //cta cte hereda de cuenta
	  
	//atributos propios de la subclase
	private Double descubierto;
	private final Double porcentaje = 0.05; //declaro constante, que porcentaje se cobrara
		
	//constructor 
	public CuentaCorriente(){ //vacio
		super();
		descubierto = 0.0; //inicia con 500
	}
	
	public CuentaCorriente(Double dineroEnCuenta, Double descubierto){ //con parametros
		super(dineroEnCuenta);
		this.descubierto = descubierto;	
	}

	//metodos
	public void extraerEnDescubierto(Double extraerDescubierto){
		
		Double saldo=0.0; //variable local
		Double pedido=0.0;		//variable local	

		if(this.getDineroEnCuenta() >= extraerDescubierto){ 	//si tengo dinero suficente extrae
			saldo = this.getDineroEnCuenta()-extraerDescubierto;
			setDineroEnCuenta(saldo);
		}
				//se permite descubierto (max $500)y se cobra adicional
		else {
				descubierto = getDineroEnCuenta() - extraerDescubierto;
				setDescubierto(descubierto);
				pedido = getDescubierto()+(getDescubierto()*porcentaje);

				if(pedido >= -500.0){			 //|| getDineroEnCuenta()>-500){ 
						saldo = (this.getDineroEnCuenta()-pedido);
						saldo = saldo -500;
						this.setDineroEnCuenta(saldo);
					
					System.out.println("Puede extraer("+extraerDescubierto+"). Debera pagar("+pedido+").");//para mostrar en pantalla
				}
					
				else
				{
					System.out.println("Excedio el saldo permitido. ("+ pedido+").El limite es $500.");//para mostrar en pantalla
				}
		}
	}

//getter y setter	
	public Double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}

	
}//fin de subclase
