package principal;

import controlador.gestionMotherboard;
import modelo.Motherboard;

public class MotherboardApp {
	static Motherboard mo;
	static gestionMotherboard gm;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		mo= new Motherboard();
		mo.setFabricante("Asus");
		mo.setModelo("z170p");
		mo.setProveedorChipset("intel");
		mo.setCapacidadSata(4);
		mo.setPuertoM2("si");
	
	
	
		gm = new gestionMotherboard();
		gm.crearMotherboard(mo);
	//gm.editarMotherboard(mo);
	//gm.eliminarMotherboards("fabricante");
	//gm.eliminarMotherboard("Unidad Estado Solido10");
	//gm.consultarMotherboard("Unidad Estado Solido9");
	//gm.consultarMotherboards();
	
	
	}

}
