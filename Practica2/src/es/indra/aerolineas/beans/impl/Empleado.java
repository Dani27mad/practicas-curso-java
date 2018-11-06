package es.indra.aerolineas.beans.impl;

/**
 * @author aula10
 *
 */
public class Empleado extends Persona {
	
	@Override
	public String getNombre() {
	
		return nombre;
	}

	@Override
	public String solicitarInformacion() {
		return "";
	}


}
