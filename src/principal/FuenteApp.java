package principal;

import controlador.gestionFuente;
import modelo.Fuente;

public class FuenteApp {
	static Fuente fu;
	static gestionFuente gf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		fu= new Fuente();
		fu.setPotencia("600 w");
		fu.setDiametroVentilador(120);
		fu.setNumeroConectores("4");
		fu.setCertificacion(80);
		fu.setTipoModular(3);
	
	
	
		gf = new gestionFuente();
		gf.crearFuente(fu);
	//gf.editarFuente(fu);
	//gf.eliminarFuente("potencia");
	//gf.eliminarFuentes("Unidad Estado Solido10");
	//gf.consultarFuente("Unidad Estado Solido9");
	//gf.consultarFuentes();
	
	
	}

}
