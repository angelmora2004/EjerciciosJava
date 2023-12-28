package ejercicio_5_2_Relacion_de_Composicion;

/**
 * @author Angel Mora
 * 
 *         Modificar el programa anterior para incluir las siguientes clases: ○
 *         Una clase Recta que contenga exactamente 2 puntos. Se debe definir
 *         los siguientes métodos para dicha clase: • Un método que calcule la
 *         pendiente de la recta. • Un método que calcule la longitud de la
 *         recta. ○ Una clase Polígono que tenga un nombre y este conformada por
 *         mínimo 3 puntos. El orden de los puntos se tiene en cuenta en la
 *         especificación del polígono.
 */

public class Recta {

	Punto punto1, punto2;

    Recta(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    double calcularPendiente() {
        if (punto1.getX() == punto2.getX()) {
            
            return Double.POSITIVE_INFINITY;
        } else {
            return (double) (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
        }
    }

    double calcularLongitud() {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }
	
}
