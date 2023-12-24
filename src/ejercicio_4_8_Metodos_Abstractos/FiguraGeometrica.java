package ejercicio_4_8_Metodos_Abstractos;

/**
 * @author Angel Mora
 * 
 *         Realizar el ejercicio 2.4 sobre figuras geométricas definiendo una
 *         clase abstracta denominada Figura geométrica con los métodos
 *         abstractos para calcular el área y el perímetro de la figura. Las
 *         subclases Círculo, Rectángulo y Cuadrado deben heredar de la clase
 *         Figura geométrica. La clase Triángulo rectángulo debe ser una
 *         subclase de Triángulo.
 */

public  abstract class FiguraGeometrica {

	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
}
