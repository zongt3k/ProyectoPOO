package modelo;

public class Almacenamiento {

	 private String tipoAlmacenamiento;
	 private int 	capacidad;
	 private String tipoConexion;
	 private int 	velocidadLectura;
	 private int 	velocidadEscritura;


	public String getTipoAlmacenamiento() {
		return tipoAlmacenamiento;
	}
	public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
		this.tipoAlmacenamiento = tipoAlmacenamiento;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipoConexion() {
		return tipoConexion;
	}
	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}
	public int getVelocidadLectura() {
		return velocidadLectura;
	}
	public void setVelocidadLectura(int velocidadLectura) {
		this.velocidadLectura = velocidadLectura;
	}
	public int getVelocidadEscritura() {
		return velocidadEscritura;
	}
	public void setVelocidadEscritura(int velocidadEscritura) {
		this.velocidadEscritura = velocidadEscritura;
	}
	 
	 
	 
}
