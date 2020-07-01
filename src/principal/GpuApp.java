package principal;

import controlador.gestionGpu ;
import modelo.Gpu ;

public class GpuApp {
	static Gpu gp;
	static gestionGpu gg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		gp= new Gpu();
		gp.setTipoGpu ("Nvidia");
		gp.setMarcaGPU("EVGA");
		gp.setSerieGpu(2000);
		gp.setCapacidadVRAM(8);
		gp.setTipoAPI(3000);
	
	
	
		gg = new gestionGpu();
		gg.crearGpu(gp);
	//gg.editarGpu(gp);
	//gg.eliminarGpu("tipoGpu");
	//gg.eliminarGpus("Unidad Estado Solido10");
	//gg.consultarGpu("Unidad Estado Solido9");
	//gg.consultarGpus();
	
	
	}

}
