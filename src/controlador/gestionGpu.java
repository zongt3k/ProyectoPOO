package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import gestionBase.Conexion;
import modelo.Gpu;


public class gestionGpu {
Conexion cn;
	
	
	public String crearGpu (Gpu u) {
		String response="";
		
	String cadenaSQL = " insert into Gpu (tipoGpu, marcaGPU, serieGpu, capacidadVRAM, tipoAPI)"
			+ " values  ('"+u.getTipoGpu()+"',"+ "'"+u.getmMarcaGPU()+"','"+u.getSerieGpu()+"','"+u.getCapacidadVRAM()+"',"
					+ "'"+u.getTipoAPI()+"')";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String editarGpu(Gpu u) {
		String response="";
		
	String cadenaSQL = "update Gpu SET tipoGpu= '"+u.getTipoGpu()+"', marcaGPU= '"+u.getmMarcaGPU()+"', serieGpu= '"+u.getSerieGpu()
	+"', capacidadVRAM= '"+u.getCapacidadVRAM()+"', tipoAPI= '"+u.getTipoAPI()+"' WHERE 1;";
	
	cn = new Conexion();
	cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarGpu (String tipoGpu) {
		String response="";
		String cadenaSQL = "DELETE FROM Gpu WHERE tipoGpu= '"+tipoGpu+"'";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
	
	public String eliminarGpus (String tipoGpu) {
		String response="";
		String cadenaSQL = "delete FROM Gpu WHERE tipoGpu= "+tipoGpu+";";
		cn = new Conexion();
		response = cn.ejecutarQuery(cadenaSQL);
	
	return response;
	}
public String consultarGpu (String tipoGpu) {
		
		String response="";
		String cadenaSQL = "select * FROM Gpu WHERE tipoGpu= "+"tipoGpu"+";";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistro(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString (2)+ " "+ rs.getInt (3) + " " + rs.getInt (4)+ " " + " " + rs.getInt (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
	
public String consultarGpus () {
		
		String response="";
		String cadenaSQL = "select * from Gpu;";
		cn = new Conexion();
	
	try {
		ResultSet rs = cn.consultarRegistros(cadenaSQL);
		
		while (rs.next()) {
			
			System.out.println (rs.getString(1) + " " + rs.getString(2)+ " "+ rs.getInt (3) + " " + rs.getInt (4)+ " " + " " + rs.getInt (5));
		}
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return response;
}
}

	
