package EnsamblePC;

public class Motherboard {
	 
	 private String fabricante;
	 private String	modelo;
	 private String proveedorChipset;
	 private int 	capacidadSata;
	 private String 	puertoM2;
	public Motherboard(String fabricante, String modelo, String proveedorChipset, int capacidadSata, String puertoM2) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.proveedorChipset = proveedorChipset;
		this.capacidadSata = capacidadSata;
		this.puertoM2 = puertoM2;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getProveedorChipset() {
		return proveedorChipset;
	}
	public void setProveedorChipset(String proveedorChipset) {
		this.proveedorChipset = proveedorChipset;
	}
	public int getCapacidadSata() {
		return capacidadSata;
	}
	public void setCapacidadSata(int capacidadSata) {
		this.capacidadSata = capacidadSata;
	}
	public String getPuertoM2() {
		return puertoM2;
	}
	public void setPuertoM2(String puertoM2) {
		this.puertoM2 = puertoM2;
	}
	 
	 
}
