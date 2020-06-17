package Principal;

import controlador.gestionProcesador;
import modelo.Procesador;

public class PcMR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Procesador pr = new Procesador();
		
		pr.setMarcaProcesador("AMD Ryzen");
		pr.setGenProce(3000);
		pr.setVersionProce("3600x");
		pr.setInfoNucleos(6);
		pr.setInfoHilos(12);
		pr.setInfoFrecuencia("3.4 ghz");
		
		
		gestionProcesador gu = new gestionProcesador();
		gu.crearProcesador(pr);
	}

}
