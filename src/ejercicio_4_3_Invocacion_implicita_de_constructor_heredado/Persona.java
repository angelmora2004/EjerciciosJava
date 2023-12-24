package ejercicio_4_3_Invocacion_implicita_de_constructor_heredado;

/**
 * @author Angel Mora
 * 
 * Desarrollar el código del siguiente diagrama en la figura 4.10 .
 */

public class Persona {

	public String nombre;
	public String direccion;
	
	public Persona(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
