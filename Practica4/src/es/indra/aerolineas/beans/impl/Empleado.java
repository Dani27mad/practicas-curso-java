/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author DaniLoren
 *
 */
public class Empleado extends Persona {

	/**
	 * @return the nombre
	 */
	@Override
	public String getNombre() {
		return nombre;

	}

	@Override
	public String solicitarInformacion() {
		return "";
	}
}
