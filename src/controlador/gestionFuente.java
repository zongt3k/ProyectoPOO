package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Fuente;


public class gestionFuente {
Conexion cn;
	
	
	public String crearFuente (Fuente u) {
		String response="";
		
	String cadenaSQL = " insert into Fuente (potencia, diametroVentilador, numeroConectores, certificacion, tipoModular)"
			+ " values  ('"+u.getPotencia()+"',"+ "'"+u.getDiametroVentilador()+"','"+u.getNumeroConectores()+"','"+u.getCertificacion()+"',"
					+ "'"+u.getTipoModular()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarFuente(Fuente u) {
		String response="";
		
	String cadenaSQL = "update Fuente SET potencia= '"+u.getPotencia()+"', diametroVentilador= '"+u.getDiametroVentilador()+"', numeroConectores= '"+u.getNumeroConectores()
	+"', certificacion= '"+u.getCertificacion()+"', tipoModular= '"+u.getTipoModular()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarFuente (String potencia) {
		String response="";
		String cadenaSQL = "DELETE FROM Fuente WHERE potencia= '"+potencia+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarFuentes (String potencia) {
		String response="";
		String cadenaSQL = "delete FROM Fuente WHERE potencia= "+potencia+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarFuente (String potencia) {
		
		String response="";
		String cadenaSQL = "select * FROM Fuente WHERE potencia= "+"potencia"+";";
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
	
public String consultarFuente () {
		
		String response="";
		String cadenaSQL = "select * from Fuente;";
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

	
