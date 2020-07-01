package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Mouse;


public class gestionMouse {
Conexion cn;
	
	
	public String crearMouse (Mouse u) {
		String response="";
		
	String cadenaSQL = " insert into Mouse (tipoMouse, tipoConexion, dpiMaximo, numMacros, pesas)"
			+ " values  ('"+u.getTipoMouse()+"',"+ "'"+u.getTipoConexion()+"','"+u.getDpiMaximo()+"','"+u.getNumMacros()+"',"
					+ "'"+u.getPesas()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarMouse(Mouse u) {
		String response="";
		
	String cadenaSQL = "update Mouse SET tipoMouse= '"+u.getTipoMouse()+"', tipoConexion= '"+u.getTipoConexion()+"', dpiMaximo= '"+u.getDpiMaximo()
	+"', numMacros= '"+u.getNumMacros()+"', pesas= '"+u.getPesas()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarMouse(String tipoMouse) {
		String response="";
		String cadenaSQL = "DELETE FROM Almacenamiento WHERE tipoAlmacenamiento= '"+tipoMouse+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarMouses (String tipoMouse) {
		String response="";
		String cadenaSQL = "delete FROM Almacenamiento WHERE tipoMouse= "+tipoMouse+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarMouse (String tipoMouse) {
		
		String response="";
		String cadenaSQL = "select * FROM Mouse WHERE tipoMouse= "+"tipoMouse"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getString (4)+ " " + " " + rs.getString (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarMouses () {
		
		String response="";
		String cadenaSQL = "select * from Mouse;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getString (4)+ " " + " " + rs.getString (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
}

	
