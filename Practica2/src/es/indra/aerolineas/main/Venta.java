/**
 * 
 */
package es.indra.aerolineas.main;

import es.indra.aerolineas.beans.Aerolinea;
import es.indra.aerolineas.beans.Empleado;
import es.indra.aerolineas.beans.Pasajero;
import es.indra.aerolineas.beans.Vuelo;

/**
 * @author M
 *
 */
public class Venta {
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   );
		}
		return vuelos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vuelo[] vuelos = creaVuelos();
		
		Aerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
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
		
		aa.consultarVuelos("Bcn");
		aa.consultarVuelos("Bcn","Mad");
		
		aa.anularVuelos("A","B");
		aa.anularVuelos();
		
		

	}

}