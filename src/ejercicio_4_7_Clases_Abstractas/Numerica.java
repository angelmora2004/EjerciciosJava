package ejercicio_4_7_Clases_Abstractas;

/**
 * @author Angel Mora
 * 
 *         Definir una clase abstracta denominada Numérica que tenga los
 *         siguientes métodos abstractos: ○ public String toString(): convierte
 *         el número a String. ○ public boolean equals (Object ob): compara el
 *         objeto con el parámetro. ○ public Numérica sumar(Numérica número):
 *         retorna la suma de los dos números. ○ public Numérica restar(Numérica
 *         número): retorna la resta de los dos números. ○ public Numérica
 *         multiplicar(Numérica número): retorna la multiplicación de los dos
 *         números. ○ public Numérica dividir(Numérica número): retorna la
 *         división de los dos números. Definir una clase Fracción que
 *         representa un número fraccionario, el cual hereda de la clase
 *         Numérica y tiene dos atributos (tipo int) que representan el
 *         numerador y denominador de la fracción. Se deben implementar todos
 *         los métodos heredados. u Crear una clase de prueba que utilice los
 *         métodos implementados.
 */

public abstract class Numerica {

	public abstract String toString();
	
	public abstract boolean equals(Object ob);
	
	public abstract Numerica sumar(Numerica numero);
	
	public abstract Numerica restar(Numerica numero);
	
	public abstract Numerica multiplicar(Numerica numero);
	
	public abstract Numerica dividir(Numerica numero);
	
}
