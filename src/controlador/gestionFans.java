package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Fans ;


public class gestionFans {
Conexion cn;
	
	
	public String crearFans (Fans  u) {
		String response="";
		
	String cadenaSQL = " insert into Fans (numFans, leds, tamaño, velocidadFan)"
			+ " values  ('"+u.getNumFans()+"',"+ "'"+u.getLeds()+"','"+u.getTamaño()+"','"+u.getVelocidadFan()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarFans(Fans u) {
		String response="";
		
	String cadenaSQL = "update Fans SET numFans= '"+u.getNumFans()+"', leds= '"+u.getLeds()+"', tamaño= '"+u.getTamaño()
	+"', velocidadFan= '"+u.getVelocidadFan()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarFan (int numFans) {
		String response="";
		String cadenaSQL = "DELETE FROM Fans WHERE numFanso= '"+numFans+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarFans (int numFans) {
		String response="";
		String cadenaSQL = "delete FROM Fans WHERE numFans= "+numFans+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarFan (int numFans) {
		
		String response="";
		String cadenaSQL = "select * FROM Fans WHERE numFans= "+"numFans"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getInt(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getString (4));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarnFans () {
		
		String response="";
		String cadenaSQL = "select * from nFans;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getInt(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getString (4));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
}

	
