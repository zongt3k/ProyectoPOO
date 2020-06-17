package modelo;

public class Ram {

	 private String marcaRam;
	 private int 	numRam;
	 private String capacidadRam;
	 private int 	frecuenciaRam;
	 private int 	infoFrecuencia;
	public Ram(String marcaRam, int numRam, String capacidadRam, int frecuenciaRam, int infoFrecuencia) {
		super();
		this.marcaRam = marcaRam;
		this.numRam = numRam;
		this.capacidadRam = capacidadRam;
		this.frecuenciaRam = frecuenciaRam;
		this.infoFrecuencia = infoFrecuencia;
	}
	public String getMarcaRam() {
		return marcaRam;
	}
	public void setMarcaRam(String marcaRam) {
		this.marcaRam = marcaRam;
	}
	public int getNumRam() {
		return numRam;
	}
	public void setNumRam(int numRam) {
		this.numRam = numRam;
	}
	public String getCapacidadRam() {
		return capacidadRam;
	}
	public void setCapacidadRam(String capacidadRam) {
		this.capacidadRam = capacidadRam;
	}
	public int getFrecuenciaRam() {
		return frecuenciaRam;
	}
	public void setFrecuenciaRam(int frecuenciaRam) {
		this.frecuenciaRam = frecuenciaRam;
	}
	public int getInfoFrecuencia() {
		return infoFrecuencia;
	}
	public void setInfoFrecuencia(int infoFrecuencia) {
		this.infoFrecuencia = infoFrecuencia;
	}
	 
	 
}
