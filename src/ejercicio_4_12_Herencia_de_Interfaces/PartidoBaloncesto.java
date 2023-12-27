package ejercicio_4_12_Herencia_de_Interfaces;

/**
 * @author Angel Mora
 */

public interface PartidoBaloncesto extends MatchDeportivo {

	static final int duracionPartidoBaloncesto = 40;
	
	void setCestasEquipoLocal(int marcador);
	
	void setCestasEquipoVisitante(int marcador);
	
}
