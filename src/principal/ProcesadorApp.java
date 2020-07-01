package principal;

import controlador.gestionProcesador;
import modelo.Procesador;


public class ProcesadorApp {
	static Procesador pro;
	static gestionProcesador gp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		pro= new Procesador();
		pro.setMarcaProcesador("Ryzen");
		pro.setGenProce(3);
		pro.setVersionProce("3000");
		pro.setInfoNucleos(8);
		pro.setInfoHilos(12);
		pro.setInfoFrecuencia("3.5");
	
	
	
		gp = new gestionProcesador();
		gp.crearProcesador(pro);
	//gp.editarProcesador(pro);
	//gp.eliminarProcesadors("tipoAlmacenamiento");
	//gp.eliminarProcesador("Unidad Estado Solido10");
	//gp.consultarProcesador("Unidad Estado Solido9");
	//gp.consultarProcesadors();
	
	
	}

}
