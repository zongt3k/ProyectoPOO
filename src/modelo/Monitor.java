package modelo;

public class Monitor {
	
	private String marcaMonitor;
	 private int 	pulgadas;
	 private String fTasaderefreso;
	 private int 	tipoPanel;
	 private int 	cantidadMonitores;
	public Monitor(String marcaMonitor, int pulgadas, String fTasaderefreso, int tipoPanel, int cantidadMonitores) {
		super();
		this.marcaMonitor = marcaMonitor;
		this.pulgadas = pulgadas;
		this.fTasaderefreso = fTasaderefreso;
		this.tipoPanel = tipoPanel;
		this.cantidadMonitores = cantidadMonitores;
	}
	public String getMarcaMonitor() {
		return marcaMonitor;
	}
	public void setMarcaMonitor(String marcaMonitor) {
		this.marcaMonitor = marcaMonitor;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getfTasaderefreso() {
		return fTasaderefreso;
	}
	public void setfTasaderefreso(String fTasaderefreso) {
		this.fTasaderefreso = fTasaderefreso;
	}
	public int getTipoPanel() {
		return tipoPanel;
	}
	public void setTipoPanel(int tipoPanel) {
		this.tipoPanel = tipoPanel;
	}
	public int getCantidadMonitores() {
		return cantidadMonitores;
	}
	public void setCantidadMonitores(int cantidadMonitores) {
		this.cantidadMonitores = cantidadMonitores;
	}
	 
	 
}
