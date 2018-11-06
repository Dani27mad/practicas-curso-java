/**
 * 
 */
package es.indra.aerolineas.beans.impl;


	public abstract class Persona {
	
	protected String nombre;
	protected int id;
	protected String apellido; 
	protected String dni;


	public Persona() {
	super();
}
	public abstract String solicitarInformacion();
/**
 * 
 * @return Devuelve el nombre de la persona en mayúscula
 */
	public String getNombre() {
	
	return nombre.toUpperCase();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}