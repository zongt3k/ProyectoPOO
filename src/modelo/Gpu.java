package modelo;

public class Gpu {
	 
	
	 private String tipoGpu;
	 private String marcaGPU;
	 private int 	serieGpu;
	 private int 	capacidadVRAM;
	 private int 	tipoAPI;
	
	 public Gpu(String tipoGpu, String marcaGPU, int serieGpu, int capacidadVRAM, int tipoAPI) {
		super();
		this.tipoGpu = tipoGpu;
		this.marcaGPU = marcaGPU;
		this.serieGpu = serieGpu;
		this.capacidadVRAM = capacidadVRAM;
		this.tipoAPI = tipoAPI;
	}
	public String getTipoGpu() {
		return tipoGpu;
	}
	public void setTipoGpu(String tipoGpu) {
		this.tipoGpu = tipoGpu;
	}
	public String getmMarcaGPU() {
		return marcaGPU;
	}
	public void setMarcaGPU(String marcaGPU) {
		this.marcaGPU = marcaGPU;
	}
	public int getSerieGpu() {
		return serieGpu;
	}
	public void setSerieGpu(int serieGpu) {
		this.serieGpu = serieGpu;
	}
	public int getCapacidadVRAM() {
		return capacidadVRAM;
	}
	public void setCapacidadVRAM(int capacidadVRAM) {
		this.capacidadVRAM = capacidadVRAM;
	}
	public int getTipoAPI() {
		return tipoAPI;
	}
	public void setTipoAPI(int tipoAPI) {
		this.tipoAPI = tipoAPI;
	}
	 
	 
	

	 
}
