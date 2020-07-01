package controlador;
import java.sql.ResultSet;
import java.sql.SQLException;


import gestionBase.Conexion;
import modelo.Cable;

public class gestionCable {
	Conexion cn;
	
	
	public String crearCable (Cable u) {
		String response="";
		
	String cadenaSQL = " insert into Cable (tipocable, versioncable, medidacable)"
			+ " values  ('"+u.getTipoCable()+"',"+" '"+u.getVersionCable()+"','"+u.getMedidaCable()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarCable(Cable u) {
		String response="";
		
	String cadenaSQL = "update Cable SET tipoCable= '"+u.getTipoCable()+"', versionCable= '"+u.getVersionCable()+"', medidaCable= '"+u.getMedidaCable()
	+"'WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarCable (String tipoCable) {
		String response="";
		String cadenaSQL = "DELETE FROM Cable WHERE tipoCable= '"+tipoCable+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarCables (String tipoCable) {
		String response="";
		String cadenaSQL = "delete FROM Cable WHERE tipoCable= "+tipoCable+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarCable (String tipoCable) {
		
		String response="";
		String cadenaSQL = "select * FROM Cable WHERE tipoCable= "+"tipoCable"+";";
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
	
public String consultarCables () {
		
		String response="";
		String cadenaSQL = "select * from Cable;";
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
