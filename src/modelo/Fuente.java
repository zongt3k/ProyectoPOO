package modelo;

public class  Fuente {
	
	 private String potencia;
	 private int 	diametroVentilador;
	 private String numeroConectores;
	 private int 	certificacion;
	 private  int	tipoModular;
	
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
