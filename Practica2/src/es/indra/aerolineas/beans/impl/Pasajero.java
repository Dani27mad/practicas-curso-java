/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.HashMap;
import java.util.Map;

public class Pasajero extends Persona{
	
	private Vuelo[] vuelos;
	private Map<Integer, String[]> billete = new HashMap<Integer, String[]>(); 

	
	public Pasajero() {
		super();
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

public String getApellido() {
	return apellido.toUpperCase();
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String solicitarInformacion() {
	
	return "";
}

}
