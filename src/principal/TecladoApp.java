package principal;

import controlador.gestionTeclado;
import modelo.Teclado;

public class TecladoApp {
	static Teclado tec;
	static gestionTeclado gt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		tec= new Teclado();
		tec.setTipoTeclado("Mecanico");
		tec.setTipoTeclas("Switch cherry mx red");
		tec.setConexion("Alambrica");
		tec.setLenguaje("EUA");
	
	
	
	
		gt = new gestionTeclado();
		gt.crearTeclado(tec);
	//gt.editarTeclado(tec);
	//gt.eliminarTeclados("tipoAlmacenamiento");
	//gt.eliminarTeclado("Unidad Estado Solido10");
	//gt.consultarTeclado("Unidad Estado Solido9");
	//gt.consultarTeclados();
	
	
	}

}
