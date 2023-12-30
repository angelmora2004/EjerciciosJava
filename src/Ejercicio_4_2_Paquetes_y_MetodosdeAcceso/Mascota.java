package ejercicio_4_2_Paquetes_y_MetodosdeAcceso;

/**
 * @author Angel Mora
 * 
 *         Definir un paquete denominado TiendaMascotas, el cual contiene una
 *         jerarquía de animales. Mascota es la clase raíz. Los animales que
 *         tiene la tienda pueden ser perros y gatos. Los perros se categorizan
 *         en perros grandes, medianos y pequeños. A su vez, los perros pequeños
 *         pueden ser de las siguientes razas: caniche, yorkshire terrier,
 *         schnauzer y chihuahua. Los perros medianos: collie, dálmata, bulldog,
 *         galgo y sabueso. Por último, las razas de perros grandes: pastor
 *         alemán, doberman y rotweiller. Los gatos se categorizan en gatos sin
 *         pelo, gatos de pelo largo y gatos de pelo corto. Las razas de gatos
 *         sin pelo pueden ser: esfinge, elfo y donskoy. Los gatos de pelo
 *         largo: angora, himalayo, balinés y somalí. Finalmente, los gatos de
 *         pelo corto: azul ruso, británico, manx y devon rex. Todos estos
 *         animales tienen un nombre, una edad y un color. Los perros tienen
 *         atributos adicionales como peso y un atributo booleano para
 *         determinar si muerde o no. Todos los perros tienen un método estático
 *         denominado “sonido” que imprime en pantalla “Los perros ladran”. Los
 *         gatos tienen atributos adicionales como: altura de salto y longitud
 *         de salto. Todos los gatos tienen un método estático denominado
 *         “sonido” que imprime en pantalla “Los gatos maúllan y ronronean”.
 */

public class Mascota {

	String nombre;
	int edad;
	String color;
	
	public Mascota(String nombre, int edad, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
		
}
