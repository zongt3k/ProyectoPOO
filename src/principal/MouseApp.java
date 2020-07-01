package principal;

import controlador.gestionMouse;
import modelo.Mouse;

public class MouseApp {
	static Mouse mo;
	static gestionMouse gm;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		mo= new Mouse();
		mo.setTipoMouse("Mecanico");
		mo.setTipoConexion("Inalambrico");
		mo.setDpiMaximo("5000");
		mo.setNumMacros("3");
		mo.setPesas("6");
	
	
	
		gm = new gestionMouse();
		gm.crearMouse(mo);
	//gm.editarMouse(mo);
	//gm.eliminarMouses("tipoAlmacenamiento");
	//gm.eliminarMouse("Unidad Estado Solido10");
	//gm.consultarMouse("Unidad Estado Solido9");
	//gm.consultarMouses();
	
	
	}

}
