package controlador;
import java.sql.ResultSet;
import java.sql.SQLException;


import gestionBase.Conexion;
import modelo.Disipacion;

public class gestionDisipacion {
	Conexion cn;
	
	
	public String crearDisipacion (Disipacion u) {
		String response="";
		
	String cadenaSQL = " insert into Disipacion (tipoDisipacion, marcaDisipador, fanSpeed)"
			+ " values  ('"+u.getTipoDisipacion()+"',"+ "'"+u.getMarcaDisipador()+"','"+u.getFanSpeed()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarDisipacion(Disipacion u) {
		String response="";
		
	String cadenaSQL = "update Disipacion SET tipoDisipacion= '"+u.getTipoDisipacion()+"', marcaDisipador= '"+u.getMarcaDisipador()+"', fanSpeed= '"+u.getFanSpeed()
	+"'WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarDisipacion (String tipoDisipacion) {
		String response="";
		String cadenaSQL = "DELETE FROM Disipacion WHERE tipoDisipacion= '"+tipoDisipacion+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarDisipacions (String tipoDisipacion) {
		String response="";
		String cadenaSQL = "delete FROM Case WHERE tipoDisipacion= "+tipoDisipacion+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarDisipacion (String tipoDisipacion) {
		
		String response="";
		String cadenaSQL = "select * FROM Case WHERE tipoDisipacion= "+"tipoDisipacion"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getInt (3));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarDisipacion () {
		
		String response="";
		String cadenaSQL = "select * from Disipacion;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getInt (3));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}


}
