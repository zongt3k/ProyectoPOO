package principal;

import controlador.gestionGabinete;
import modelo.Gabinete;

public class GabineteApp {
	static Gabinete cs;
	static gestionGabinete gca;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	cs = new Gabinete();
	cs.setTipoTapa("Vidrio Templado");
	cs.setLeds("RGB");
	cs.setNumBahias("4");
	
	
	
	gca = new gestionGabinete();
	gca.crearGabinete(cs);
	//gca.editarGabinetee(cs);
	//gca.eliminarGabinete("tipoCable");
	//gca.eliminarGabinete("DP");
	//gca.consultarGabinete("DP");
	//gca.consultarGabinete();
	
	
	}

}
