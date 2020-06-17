package EnsamblePC;

public class Procesador {

	 private String marcaProcesador;
	 private int 	genProce;
	 private String versionProce;
	 private int 	infoNucelos;
	 private int 	infoFrecuencia;
	
	 public Procesador(String marcaProcesador, int genProce, String versionProce, int infoNucelos, int infoFrecuencia) {
		super();
		this.marcaProcesador = marcaProcesador;
		this.genProce = genProce;
		this.versionProce = versionProce;
		this.infoNucelos = infoNucelos;
		this.infoFrecuencia = infoFrecuencia;
	}
	public String getMarcaProcesador() {
		return marcaProcesador;
	}
	public void setMarcaProcesador(String marcaProcesador) {
		this.marcaProcesador = marcaProcesador;
	}
	public int getGenProce() {
		return genProce;
	}
	public void setGenProce(int genProce) {
		this.genProce = genProce;
	}
	public String getVersionProce() {
		return versionProce;
	}
	public void setVersionProce(String versionProce) {
		this.versionProce = versionProce;
	}
	public int getInfoNucelos() {
		return infoNucelos;
	}
	public void setInfoNucelos(int infoNucelos) {
		this.infoNucelos = infoNucelos;
	}
	public int getInfoFrecuencia() {
		return infoFrecuencia;
	}
	public void setInfoFrecuencia(int infoFrecuencia) {
		this.infoFrecuencia = infoFrecuencia;
	}
	 
	 
}
