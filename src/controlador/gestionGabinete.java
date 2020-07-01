package controlador;
import java.sql.ResultSet;
import java.sql.SQLException;


import gestionBase.Conexion;
import modelo.Gabinete;

public class gestionGabinete {
	Conexion cn;
	
	
	public String crearGabinete (Gabinete u) {
		String response="";
		
	String cadenaSQL = " insert into Gabinete(tipotapa, leds, numbahias)"
			+ " values  ('"+u.getTipoTapa()+"',"+ " '"+u.getLeds()+"','"+u.getNumBahias()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarGabinete(Gabinete u) {
		String response="";
		
	String cadenaSQL = "update Gabinete SET tipoTapa= '"+u.getTipoTapa()+"', leds= '"+u.getLeds()+"', numBahias= '"+u.getNumBahias()
	+"'WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarGabinete (String tipoTapa) {
		String response="";
		String cadenaSQL = "DELETE FROM Gabinete WHERE tipoTapa= '"+tipoTapa+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarGabinetes (String tipoTapa) {
		String response="";
		String cadenaSQL = "delete FROM Gabinete WHERE tipoTapa= "+tipoTapa+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarGabinete (String tipoTapa) {
		
		String response="";
		String cadenaSQL = "select * FROM Gabinete WHERE tipoTapa= "+"tipoTapa"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarGabinete () {
		
		String response="";
		String cadenaSQL = "select * from Gabinete;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}


}
