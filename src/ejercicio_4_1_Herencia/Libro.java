package ejercicio_4_1_Herencia;

/**
 * @author Angel Mora
 * 
 *         Definir una clase Libro para manejar la información asociada a un
 *         libro. La información de interés para un libro es: el título, el
 *         autor y el precio. Los métodos de interés son: 
 *         
 *         ○ Un constructor para crear un objeto libro, con título y autor como parámetros.
 *		   ○ Imprimir en pantalla el título, los autores y el precio del libro.
 *		   ○ Métodos get y set para cada atributo de un libro.
 *         
 *         Se debe extender la clase Libro definiendo las siguientes clases: 
 *         ○ Libros de texto con un nuevo atributo que especifica el curso al cual está asociado el libro. 
 *         ○ Libros de texto de la Universidad Nacional de Colombia:
 *         subclase de la clase anterior. Esta subclase tiene un atributo que especifica cuál facultad lo publicó. 
 *         ○ Novelas: pueden ser de diferente tipo, histórica, romántica, policíaca, realista, ciencia ficción o aventuras. 
 *         ○ Para cada una de las clases anteriores se debe definir su constructor y redefinir adecuadamente el método para
 *         visualizar del objeto.
 */

public class Libro {

	String titulo;
	String autor;
	float precio;

	public Libro(String titulo, String autor, float precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public void imprimir() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: $" + precio);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
