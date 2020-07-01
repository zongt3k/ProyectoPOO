package principal;

import controlador.gestionCable;
import modelo.Cable;

public class CableApp {
	static Cable ca;
	static gestionCable gc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ca = new Cable();
	ca.setTipoCable("DVI");
	ca.setVersionCable("2.0");
	ca.setMedidaCable(15);;
	
	
	
	gc = new gestionCable();
	gc.crearCable(ca);
	//gc.editarCable(ca);
	//gc.eliminarCables("tipoCable");
	//gc.eliminarCable("DP");
	//gc.consultarCable("DP");
	//gc.consultarCables();
	
	
	}

}
