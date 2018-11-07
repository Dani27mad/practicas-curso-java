/**
 * 
 */
package es.indra.aerolineas.main;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author M
 *
 */
public class Venta {
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];

		return vuelos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vuelo[] vuelos = creaVuelos();
		
		IAerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		Empleado emp = new Empleado();
		emp.setNombre("Antonio Marqu�z");
		
		Pasajero p = new Pasajero();
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		
		p.setId(10);
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		System.out.println("|\tLe atiende ".concat(emp.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().length);
		
		System.out.printf("|\t%s %s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(),p.getApellido(),p.getVuelos().length );
		
		System.out.println("*************************************************************************");
		
		aa.consultarVuelos();
		aa.consultarVuelos("Bcn");
		aa.consultarVuelos("Bcn","Mad");
		
		aa.anularVuelos("A","B");
		aa.anularVuelos();
		
		

	}

}
