package ejercicio_5_6_Diferencias_entre_Agregacion_y_Composicion;

/**
 * @author Angel Mora
 */

abstract public class Jugador extends Persona {

	boolean esTitular;

	Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
		super(nombre, apellidos, edad);
		this.esTitular = esTitular;
	}

}
