package ejercicio_4_11_interfaces_multiples;

/**
 * @author Angel Mora
 * 
 *         Agregar a la solución anterior una clase denominada VehículoAéreo, la
 *         cual tiene los métodos despegar, aterrizar y volar que muestran en
 *         pantalla la acción que están realizando. Agregar también dos nuevas
 *         interfaces: ○ Reactor que representa un motor de reacción. Esta
 *         interfaz tiene dos métodos encender y apagar. ○ Alas que representa
 *         las alas de un vehículo aéreo. Dicha interfaz tiene dos métodos
 *         soltar y subir tren de aterrizaje. La clase VehículoAéreo debe
 *         implementar estas interfaces. Los métodos encender y apagar de
 *         Reactor muestran en pantalla que el reactor está encendido y apagado,
 *         respectivamente. Los métodos soltar y subir tren de aterrizaje
 *         muestran en pantalla dichas acciones. En la clase de Prueba
 *         instanciar un vehículo aéreo e invocar los métodos heredados e
 *         implementados.
 */

public class VehiculoAereo implements Reactor, Alas {

	void despegar() {
		System.out.println("Despegando");
	}
	
	void aterrizar() {
		System.out.println("Aterrizando");
	}
	
	void volar() {
		System.out.println("Volando");
	}

	@Override
	public String soltar() {
		
		return "Soltando";
	}

	@Override
	public String subirTrenAterrizaje() {
		
		return "Subiendo Tren de Aterrizaje";
	}

	@Override
	public String encender() {
		
		return "El reactor esta encendido";
	}

	@Override
	public String apagar() {
		
		return "El reactor esta apagado";
	}


	
}
