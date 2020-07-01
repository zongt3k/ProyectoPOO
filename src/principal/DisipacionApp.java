package principal;

import controlador.gestionDisipacion;
import modelo.Disipacion;

public class DisipacionApp {
	static Disipacion ds;
	static gestionDisipacion gd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ds = new Disipacion();
	ds.setTipoDisipacion("DVI");
	ds.setMarcaDisipador("2.0");
	ds.setFanSpeed(15);
	
	
	
	gd = new gestionDisipacion();
	//gd.crearDisipacion(ca);
	//gd.editarDisipacion(ca);
	//gd.eliminarDisipacion("tipoCable");
	//gd.eliminarDisipacions("DP");
	//gd.consultarDisipacion("DP");
	//gd.consultarDisipacions();
	
	
	}

}
