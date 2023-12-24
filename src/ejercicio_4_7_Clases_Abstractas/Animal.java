package ejercicio_4_7_Clases_Abstractas;

/**
 * @author Angel Mora
 */

public abstract class Animal {

	protected String sonido; 
	protected String alimentos; 
	protected String habitat;
	protected String nombreCientifico;
	
	public abstract String getNombreCientifico();
	
	public abstract String getSonido();
	
	public abstract String getAlimentos();
	
	public abstract String getHabitat();
}
