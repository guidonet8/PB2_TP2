package ar.edu.unlam.pb2.tp2.cuentasBancarias;

public class CuentasBancarias {
		private String nombre;
		private String apellido;
		private Integer dni;
		private Integer numeroDeCuenta;
		protected Double saldo;
		private Double depositar;
		private Double extraer;
		private Integer candidadExtaccion;
		public CuentasBancarias (){
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public Integer getDni() {
			return dni;
		}
		public void setDni(Integer dni) {
			this.dni = dni;
		}
		public Integer getNumeroDeCuenta() {
			return numeroDeCuenta;
		}
		public void setNumeroDeCuenta(Integer numeroDeCuenta) {
			this.numeroDeCuenta = numeroDeCuenta;
		}
	
		public Double getSaldo() {
			return saldo;
		}

		public Double getDepositar() {
			return depositar;
		}
		public void depositar(Double depositar) {
			saldo=+depositar;
			
		}
		public void extraer(Double extraer) {
			saldo=-extraer;
			
		}
		

		
		
}
