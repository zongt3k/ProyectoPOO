package controlador;
 
import modelo.Procesador;
import gestionBase.gestionbaseD;
 
public class gestionProcesador {
	private Procesador pro;
	private gestionbaseD db;
	
	
	public boolean crearProcesador(Procesador u) {
		boolean resp=false;
	
	String cadenaSQL = "insert into procesadores (Marca Procesador: , genProce, versionProce, infoNucleos, infoFrecuencia, infoHilos) values ("+u.getMarcaProcesador()+","
			+u.getGenProce()+","+u.getVersionProce()+","+u.getInfoNucleos()+","+u.getInfoFrecuencia()+","+u.getInfoHilos()+","+");";
	
	
	db = new gestionbaseD();
	resp = db.insertarRegistro(cadenaSQL);
	
	if(!resp) {
		System.out.println("Error no coincide la informacion");
	} else {
		System.out.println("Se valido y se registro correctamente la informacion del Procesador ...");
		
	}
	
	return resp;
	
	
	
	}
}
