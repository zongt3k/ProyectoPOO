package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Ram;


public class gestionRam {
Conexion cn;
	
	
	public String crearRam (Ram u) {
		String response="";
		
	String cadenaSQL = " insert into Ram (marcaRam, numRam, capacidadRam, frecuenciaRam, infoFrecuencia)"
			+ " values  ('"+u.getMarcaRam()+"',"+ "'"+u.getNumRam()+"','"+u.getCapacidadRam()+"','"+u.getFrecuenciaRam()+"',"
					+ "'"+u.getInfoFrecuencia()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarRam(Ram u) {
		String response="";
		
	String cadenaSQL = "update Ram SET marcaRam= '"+u.getMarcaRam()+"', numRam= '"+u.getNumRam()+"', capacidadRam= '"+u.getCapacidadRam()
	+"', frecuenciaRam= '"+u.getFrecuenciaRam()+"', infoFrecuencia= '"+u.getInfoFrecuencia()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarRam (String marcaRam) {
		String response="";
		String cadenaSQL = "DELETE FROM Ram WHERE marcaRam= '"+marcaRam+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarRams (String marcaRam) {
		String response="";
		String cadenaSQL = "delete FROM Ram WHERE marcaRam= "+marcaRam+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarRam (String marcaRam) {
		
		String response="";
		String cadenaSQL = "select * FROM Ram WHERE marcaRam= "+"marcaRam"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getInt (2)+ " "+ rs.getString (3) + " " + rs.getInt (4)+ " " + " " + rs.getInt (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarRam () {
		
		String response="";
		String cadenaSQL = "select * from Ram;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getInt (2)+ " "+ rs.getString (3) + " " + rs.getInt (4)+ " " + " " + rs.getInt (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
}

	
