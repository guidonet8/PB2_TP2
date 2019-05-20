package ar.edu.unlam.pb2.tp2.cuentasBancarias;

public class CajaAhorro extends CuentasBancarias{
	private Integer candidadExtaccion; 

	@Override
public void extraer(Double extraer) {
	    	candidadExtaccion++;
	    	if (candidadExtaccion>5) {
	       this.saldo-=-6;
	       
	             
	    	}
	
	}
}
	
		
		
	

