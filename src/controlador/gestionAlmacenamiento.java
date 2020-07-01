package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Almacenamiento;


public class gestionAlmacenamiento {
Conexion cn;
	
	
	public String crearAlmacenamiento (Almacenamiento u) {
		String response="";
		
	String cadenaSQL = " insert into Almacenamiento (tipoAlmacenamiento, capacidad, tipoConexion, velocidadLectura, velocidadEscritura)"
			+ " values  ('"+u.getTipoAlmacenamiento()+"',"+ "'"+u.getCapacidad()+"','"+u.getTipoConexion()+"','"+u.getVelocidadLectura()+"',"
					+ "'"+u.getVelocidadEscritura()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarAlmacenamiento(Almacenamiento u) {
		String response="";
		
	String cadenaSQL = "update Almacenamiento SET tipoAlmacenamiento= '"+u.getTipoAlmacenamiento()+"', capacidad= '"+u.getCapacidad()+"', tipoConexion= '"+u.getTipoConexion()
	+"', velocidadLectura= '"+u.getVelocidadLectura()+"', velocidadEscritura= '"+u.getVelocidadEscritura()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarAlmacenamiento (String tipoAlmacenamiento) {
		String response="";
		String cadenaSQL = "DELETE FROM Almacenamiento WHERE tipoAlmacenamiento= '"+tipoAlmacenamiento+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarAlmacenamientos (String tipoAlmacenamiento) {
		String response="";
		String cadenaSQL = "delete FROM Almacenamiento WHERE tipoAlmacenamiento= "+tipoAlmacenamiento+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarAlmacenamiento (String tipoAlmacenamiento) {
		
		String response="";
		String cadenaSQL = "select * FROM Almacenamiento WHERE tipoAlmacenamiento= "+"tipoAlmacenamiento"+";";
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
	
public String consultarAlmacenameintos () {
		
		String response="";
		String cadenaSQL = "select * from Almacenamiento;";
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

	
