package principal;

import controlador.gestionMonitor;
import modelo.Monitor;

public class MonitorApp {
	static Monitor mo;
	static gestionMonitor gm;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		mo= new Monitor();
		mo.setMarcaMonitor("MSI");
		mo.setPulgadas(24);
		mo.setfTasaderefreso("144HZ");
		mo.setTipoPanel(1);
		mo.setCantidadMonitores(3);
	
	
	
		gm = new gestionMonitor();
		gm.crearMonitor(mo);
	//gm.editarMonitor(mo);
	//gm.eliminarMonitors("marcaMonitor");
	//gm.eliminarMonitor("Unidad Estado Solido10");
	//gm.consultarMonitor("Unidad Estado Solido9");
	//gm.consultarMonitors();
	
	
	}

}
