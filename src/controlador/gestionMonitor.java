package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Monitor;


public class gestionMonitor {
Conexion cn;
	
	
	public String crearMonitor (Monitor u) {
		String response="";
		
	String cadenaSQL = " insert into Monitor (marcaMonitor, pulgadas, fTasaderefresco, tipoPanel, cantidadMonitores)"
			+ " values  ('"+u.getMarcaMonitor()+"',"+ "'"+u.getPulgadas()+"','"+u.getfTasaderefreso()+"','"+u.getTipoPanel()+"',"
					+ "'"+u.getCantidadMonitores()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarMonitor(Monitor u) {
		String response="";
		
	String cadenaSQL = "update Monitor SET marcaMonitor= '"+u.getMarcaMonitor()+"', pulgadas= '"+u.getPulgadas()+"', fTasaderefresco= '"+u.getfTasaderefreso()
	+"', tipoPanel= '"+u.getTipoPanel()+"', cantidadMonitores= '"+u.getCantidadMonitores()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarMonitor (String marcaMonitor) {
		String response="";
		String cadenaSQL = "DELETE FROM Monitor WHERE marcaMonitor= '"+marcaMonitor+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarMonitors (String marcaMonitor) {
		String response="";
		String cadenaSQL = "delete FROM Monitor WHERE marcaMonitor= "+marcaMonitor+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarMonitor (String marcaMonitor) {
		
		String response="";
		String cadenaSQL = "select * FROM Monitor WHERE marcaMonitor= "+"marcaMonitor"+";";
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
	
public String consultarMonitors () {
		
		String response="";
		String cadenaSQL = "select * from Monitor;";
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

	
