package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Motherboard;


public class gestionMotherboard {
Conexion cn;
	
	
	public String crearMotherboard (Motherboard u) {
		String response="";
		
	String cadenaSQL = " insert into Motherboard (fabricante, modelo, proveedorChipset, capacidadSata, puertoM2)"
			+ " values  ('"+u.getFabricante()+"',"+ "'"+u.getModelo()+"','"+u.getProveedorChipset()+"','"+u.getCapacidadSata()+"',"
					+ "'"+u.getPuertoM2()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarMotherboard(Motherboard u) {
		String response="";
		
	String cadenaSQL = "update Motherboard SET fabricante= '"+u.getFabricante()+"', modelo= '"+u.getModelo()+"', proveedorChipset= '"+u.getProveedorChipset()
	+"', capacidadSata= '"+u.getCapacidadSata()+"', puertoM2= '"+u.getPuertoM2()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarMotherboard (String fabricante) {
		String response="";
		String cadenaSQL = "DELETE FROM Motherboard WHERE fabricante= '"+fabricante+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarMotherboards (String fabricante) {
		String response="";
		String cadenaSQL = "delete FROM Motherboard WHERE fabricante= "+fabricante+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarMotherboard (String fabricante) {
		
		String response="";
		String cadenaSQL = "select * FROM Motherboard WHERE fabricante= "+"fabricante"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getInt (4)+ " " + " " + rs.getString (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarMotherboards () {
		
		String response="";
		String cadenaSQL = "select * from Motherboard;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getString (3) + " " + rs.getInt (4)+ " " + " " + rs.getString (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
}

	
