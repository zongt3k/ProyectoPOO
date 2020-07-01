package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Procesador;


public class gestionProcesador {
Conexion cn;
	
	
	public String crearProcesador (Procesador u) {
		String response="";
		
	String cadenaSQL = " insert into Procesador (marcaProcesador, genProce, versionProce, infoNucleos, infoHilos, infoFrecuencia)"
			+ " values  ('"+u.getMarcaProcesador()+"',"+ "'"+u.getGenProce()+"','"+u.getVersionProce()+"','"+u.getInfoNucleos()+"',"
					+ "'"+u.getInfoHilos()+"', "+" '"+u.getInfoFrecuencia()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarProcesador(Procesador u) {
		String response="";
		
	String cadenaSQL = "update Procesador SET marcaProcesador= '"+u.getMarcaProcesador()+"', genProce= '"+u.getGenProce()+"', versionProce= '"+u.getVersionProce()
	+"', infoNucleos= '"+u.getInfoNucleos()+"', infoHilos= '"+u.getInfoHilos()+"' infoFrecuencia= '"+u.getInfoFrecuencia()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarProcesador (String marcaProcesador) {
		String response="";
		String cadenaSQL = "DELETE FROM Procesador WHERE marcaProcesador= '"+marcaProcesador+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarProcesadors (String marcaProcesador) {
		String response="";
		String cadenaSQL = "delete FROM Procesador WHERE marcaProcesador= "+marcaProcesador+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarProcesador (String marcaProcesador) {
		
		String response="";
		String cadenaSQL = "select * FROM Procesador WHERE marcaProcesador= "+"marcaProcesador"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getInt (2)+ " "+ rs.getString (3) + " " + rs.getInt (4)+ " " + " " + rs.getInt (5)+ " " + rs.getString (6));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarProcesadors () {
		
		String response="";
		String cadenaSQL = "select * from Procesador;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getInt (2)+ " "+ rs.getString (3) + " " + rs.getInt (4)+ " " + " " + rs.getInt (5)+ " " + rs.getString (6));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
}

	
