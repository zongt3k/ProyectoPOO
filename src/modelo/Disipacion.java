package modelo;

public class Disipacion {

	 private String tipoDisipacion;
	 private String marcaDisipador;
	 private int 	fanSpeed;
	public Disipacion(String tipoDisipacion, String marcaDisipador, int fanSpeed) {
		super();
		this.tipoDisipacion = tipoDisipacion;
		this.marcaDisipador = marcaDisipador;
		this.fanSpeed = fanSpeed;
	}
	public String getTipoDisipacion() {
		return tipoDisipacion;
	}
	public void setTipoDisipacion(String tipoDisipacion) {
		this.tipoDisipacion = tipoDisipacion;
	}
	public String getMarcaDisipador() {
		return marcaDisipador;
	}
	public void setMarcaDisipador(String marcaDisipador) {
		this.marcaDisipador = marcaDisipador;
	}
	public int getFanSpeed() {
		return fanSpeed;
	}
	public void setFanSpeed(int fanSpeed) {
		this.fanSpeed = fanSpeed;
	}
	 
	 
}
