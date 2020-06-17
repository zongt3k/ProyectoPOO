package MVC;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		}
	private int identificacion;
	private String nombre;
	private String apellido;
	private int edad;

	
public Persona(int identificacion, String nombre, String apellido, int edad) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public int getIdentificiacion() {
		return identificacion;
	}

	public void setIdentificiacion(int identificiacion) {
		this.identificacion = identificiacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
