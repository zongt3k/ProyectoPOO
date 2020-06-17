package modelo;

public class Fuente {
	
	 private String potencia;
	 private int 	diametroVentilador;
	 private String numeroConectores;
	 private int 	certificacion;
	 private int 	tipoModular;
	public Fuente(String potencia, int diametroVentilador, String numeroConectores, int certificacion,
			int tipoModular) {
		super();
		this.potencia = potencia;
		this.diametroVentilador = diametroVentilador;
		this.numeroConectores = numeroConectores;
		this.certificacion = certificacion;
		this.tipoModular = tipoModular;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public int getDiametroVentilador() {
		return diametroVentilador;
	}
	public void setDiametroVentilador(int diametroVentilador) {
		this.diametroVentilador = diametroVentilador;
	}
	public String getNumeroConectores() {
		return numeroConectores;
	}
	public void setNumeroConectores(String numeroConectores) {
		this.numeroConectores = numeroConectores;
	}
	public int getCertificacion() {
		return certificacion;
	}
	public void setCertificacion(int certificacion) {
		this.certificacion = certificacion;
	}
	public int getTipoModular() {
		return tipoModular;
	}
	public void setTipoModular(int tipoModular) {
		this.tipoModular = tipoModular;
	}
	 
	 
}
