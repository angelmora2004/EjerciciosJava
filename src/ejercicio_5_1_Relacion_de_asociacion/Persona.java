package ejercicio_5_1_Relacion_de_asociacion;

import java.util.Vector;

/**
 * @author Angel Mora
 * 
 *         Modificar el ejercicio anterior para modelar que una persona conduce
 *         un vehículo. La persona tiene los siguientes atributos: nombre,
 *         apellidos, número de documento de identidad y fecha de nacimiento. Se
 *         requieren métodos para: ○ Asignar un vehículo a una persona. Se debe
 *         tener en cuenta que una persona puede tener asignado varios vehículos
 *         de diferente tipo. ○ Desasignar un vehículo a una persona.
 *         Previamente, es necesario verificar que la persona tiene un vehículo
 *         asignado. ○ Al dar el nombre de una persona, se debe generar el total
 *         de dinero pagado en peajes por cada vehículo que esta persona tenga
 *         asignado.
 */

public class Persona {

	String nombre;
    String apellidos;
    String numeroDocumento;
    String fechaNacimiento;
    Vector<Vehiculo> vehiculosAsignados;

    Persona(String nombre, String apellidos, String numeroDocumento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        vehiculosAsignados = new Vector<Vehiculo>();
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.add(vehiculo);
    }

    public void desasignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.remove(vehiculo);
    }

    public int calcularTotalPeaje() {
        int totalPeaje = 0;
        for (Vehiculo vehiculo : vehiculosAsignados) {
            if (vehiculo instanceof Carro) {
                totalPeaje += Carro.valorPeaje;
            } else if (vehiculo instanceof Moto) {
                totalPeaje += Moto.valorPeaje;
            } else if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo;
                totalPeaje += camion.numeroEjes * Camion.valorPeajeEje;
            }
        }
        return totalPeaje;
    }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", numeroDocumento=" + numeroDocumento
				+ ", fechaNacimiento=" + fechaNacimiento + ", vehiculosAsignados=" + vehiculosAsignados + "]";
	}
    
    
	
}
