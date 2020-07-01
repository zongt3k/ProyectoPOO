package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Teclado;


public class gestionTeclado {
Conexion cn;
	
	
	public String crearTeclado (Teclado u) {
		String response="";
		
	String cadenaSQL = " insert into Teclado (tipoTeclado, tipoTeclas, conexion, lenguaje)"
			+ " values  ('"+u.getTipoTeclado()+"',"+ "'"+u.getTipoTeclas()+"','"+u.getConexion()+"','"+u.getLenguaje()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarTeclado (Teclado u) {
		String response="";
		
	String cadenaSQL = "update Teclado SET tipoTeclado= '"+u.getTipoTeclado()+"', tipoTeclas= '"+u.getTipoTeclas()+"', conexion= '"+u.getConexion()
	+"', lenguaje= '"+u.getLenguaje()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarTeclado (String tipoTeclado) {
		String response="";
		String cadenaSQL = "DELETE FROM Teclado WHERE tipoTeclado= '"+tipoTeclado+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarTeclados (String tipoTeclado) {
		String response="";
		String cadenaSQL = "delete FROM Teclado WHERE tipoTeclado= "+tipoTeclado+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarTeclado (String tipoTeclado) {
		
		String response="";
		String cadenaSQL = "select * FROM Teclado WHERE tipoTeclado= "+"tipoTeclado"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getString (4));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarTeclado () {
		
		String response="";
		String cadenaSQL = "select * from Teclado;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getString (4));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
}

	
