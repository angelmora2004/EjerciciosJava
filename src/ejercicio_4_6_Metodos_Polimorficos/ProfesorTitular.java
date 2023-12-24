package ejercicio_4_6_Metodos_Polimorficos;

/**
 * @author Angel Mora
 */

public class ProfesorTitular extends Profesor {

	int anos = 0;

	protected void imprimir() {
		System.out.println("Es un profesor titular.");
	}

	protected void imprimirAnos() {
		System.out.println("Anos = " + anos);
	}
}
