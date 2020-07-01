package principal;

import controlador.gestionFans;
import modelo.Fans;

public class FansApp {
	static Fans fa;
	static gestionFans gf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	fa= new Fans();
	fa.setNumFans(5);
	fa.setLeds("500");
	fa.setTamaño("tamaño");
	fa.setVelocidadFan("velocidadFan");

	
	
	
	gf = new gestionFans();
	gf.crearFans(fa);
	//gf.editarFans(fa);
	//gf.eliminarFan("numFans");
	//gf.eliminarFans("Unidad Estado Solido10");
	//gf.consultarFan("Unidad Estado Solido9");
	//gf.consultarFans();
	
	
	}

}
