package ar.edu.unlam.pb2.tp2.cuentasBancarias;

public class CuentaCorriente extends CuentasBancarias {
	private static final  Double  COMISION_DESCUBIERTO;
	private Double deudaAlBanco;
	private Double descubierto;
	public  CuentaCorriente(){
	this.descubierto=this.saldo*1.5;
	this.COMISION_DESCUBIERTO=0.05D;
	
	}
	@Override
	public void extraer(Double extraer) {
		if (extraer>this.descubierto) {
			deudaAlBanco=(this.saldo-this.descubierto) + COMISION_DESCUBIERTO;
		}
			
			
 
 
		}
       
             
    	}
	
}
