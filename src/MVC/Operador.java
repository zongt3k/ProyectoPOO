package MVC;

public class Operador extends Persona {
	
	public Operador(int identificiacion, String nombre, String apellido, int edad) {
		super(identificiacion, nombre, apellido, edad);
		// TODO Auto-generated constructor stub
	}

	private Usuario usrOperador;

	public Usuario getUsrOperador() {
		return usrOperador;
	}

	public void setUsrOperador(Usuario usrOperador) {
		this.usrOperador = usrOperador;
	}
	
	
}
