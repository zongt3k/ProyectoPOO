package principal;

import controlador.gestionRam;
import modelo.Ram;

public class RamApp {
	static Ram ra;
	static gestionRam gr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ra= new Ram();
		ra.setMarcaRam("Hyperex");
		ra.setNumRam(2);
		ra.setCapacidadRam("8 gb");
		ra.setFrecuenciaRam(3200);
		ra.setInfoFrecuencia(3200);
	
	
	
		gr = new gestionRam();
		gr.crearRam(ra);
	//gr.editarRam(ra);
	//gr.eliminarRams("tipoAlmacenamiento");
	//gr.eliminarRam("Unidad Estado Solido10");
	//gr.consultarRam("Unidad Estado Solido9");
	//gr.consultarRams();
	
	
	}

}
