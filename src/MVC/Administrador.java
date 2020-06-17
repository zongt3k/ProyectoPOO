package MVC;

public class Administrador extends Persona {

	private int CodigoSeguridad;
	 private String Usuario;
	
	 public Administrador(int identificacion, String nombre, String apellido, int edad, int codigoseguridad, String usuario) {
		super(identificacion, nombre, apellido, edad);
		
		this.CodigoSeguridad = codigoseguridad;
		this.Usuario = usuario;
	}
	
	public void mostrarDatos() {
		System.out.println("Identificacion: "+getIdentificiacion()+ " Nombre: "+getNombre ()+" Apellido: " +getApellido()+
			" Edad: "+getEdad()+" CodigoSeguridad: "+ CodigoSeguridad + " Usuario: "+ Usuario);
}

}
