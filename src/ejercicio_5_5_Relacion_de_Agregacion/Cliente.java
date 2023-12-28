package ejercicio_5_5_Relacion_de_Agregacion;

/**
 * @author Angel Mora
 * 
 *         Modificar el programa anterior para que soporte que las órdenes de
 *         compra están relacionadas con un único cliente. Los clientes a su vez
 *         pueden tener muchas órdenes de compra. Los cuales pueden ser empresas
 *         o clientes particulares; las primeras tienen un nombre o razón
 *         social, NIT, teléfono y dirección. Los últimos tienen nombre,
 *         apellidos, número de documento, teléfono y dirección.
 */

public class Cliente {

	private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
