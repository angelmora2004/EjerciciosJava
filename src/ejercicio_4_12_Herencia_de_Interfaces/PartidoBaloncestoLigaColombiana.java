package ejercicio_4_12_Herencia_de_Interfaces;

/**
 * @author Angel Mora
 * 
 *         Agregar a la solución anterior, una clase
 *         PartidoBaloncestoLigaColombiana con nuevos métodos, que implementen
 *         los métodos requeridos por la interfaz PartidoBaloncesto. Modificar
 *         la clase de Prueba para instanciar un objeto de dicho tipo.
 */

public class PartidoBaloncestoLigaColombiana implements PartidoBaloncesto {

	String equipoLocal;

	String equipoVisitante;

	int cestasEquipoLocal;

	int cestasEquipoVisitante;

	@Override
	public void setEquipoLocal(String nombreEquipo) {
	
		this.equipoLocal = nombreEquipo;
	}

	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		
		this.equipoVisitante = nombreEquipo;
	}

	@Override
	public void setCestasEquipoLocal(int marcador) {
		
		this.cestasEquipoLocal = marcador;
	}

	@Override
	public void setCestasEquipoVisitante(int marcador) {
		
		this.cestasEquipoVisitante = marcador;
	}
	
	void imprimirMarcador() {
		System.out.println(("Equipo local: " + equipoLocal + ": " + cestasEquipoLocal + " - Equipo visitante: "
				+ equipoVisitante + ": " + cestasEquipoVisitante));
	}

	
}
