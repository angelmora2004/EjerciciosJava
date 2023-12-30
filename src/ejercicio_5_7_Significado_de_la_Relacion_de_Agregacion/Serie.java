package ejercicio_5_7_Significado_de_la_Relacion_de_Agregacion;

/**
 * @author Angel Mora
 * 
 *         Una persona aficionada a las series de televisión requiere un
 *         programa que permita almacenar y consultar sus series. Las series
 *         tienen los siguientes atributos: título, género, país de origen y año
 *         de realización. El programa debe permitir agregar y eliminar series.
 *         Además, debe permitir la consulta de series por su título, género y
 *         país de origen.
 */

public class Serie {

	String titulo;
	String genero;
	String paisOrigen;
	int anoRealizacion;

	public Serie(String titulo, String genero, String paisOrigen, int anoRealizacion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.paisOrigen = paisOrigen;
		this.anoRealizacion = anoRealizacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getAnoRealizacion() {
		return anoRealizacion;
	}

	public void setAnoRealizacion(int anoRealizacion) {
		this.anoRealizacion = anoRealizacion;
	}

	@Override
	public String toString() {
		return "Serie: Titulo = " + titulo + ", Genero = " + genero + ", Pais de Origen = " + paisOrigen + ", Ano de Realizacion = "
				+ anoRealizacion;
	}

	
	
}
