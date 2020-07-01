package principal;

import controlador.gestionAlmacenamiento;
import modelo.Almacenamiento;

public class AlmacenamientoApp {
	static Almacenamiento alm;
	static gestionAlmacenamiento ga;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	alm= new Almacenamiento();
	alm.setTipoAlmacenamiento("Unidad Estado Solido10");
	alm.setCapacidad(500);
	alm.setTipoConexion("Sata");
	alm.setVelocidadLectura(3000);
	alm.setVelocidadEscritura(3000);
	
	
	
	ga = new gestionAlmacenamiento();
	ga.crearAlmacenamiento(alm);
	//ga.editarAlmacenamiento(alm);
	//ga.eliminarAlmacenamientos("tipoAlmacenamiento");
	//ga.eliminarAlmacenamiento("Unidad Estado Solido10");
	//ga.consultarAlmacenamiento("Unidad Estado Solido9");
	//ga.consultarAlmacenamientos();
	
	
	}

}
