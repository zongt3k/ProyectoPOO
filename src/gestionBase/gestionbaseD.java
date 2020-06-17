package gestionBase;

public class gestionbaseD {
	public boolean insertarRegistro(String sentenciaSQL) {
		
		if(sentenciaSQL.length()<60) {
			
			return false;
		}else {
			
		System.out.println("Se ejecuto la sentencia" + sentenciaSQL);
		return true;
		}
		
	}
	
	
	
	
}
