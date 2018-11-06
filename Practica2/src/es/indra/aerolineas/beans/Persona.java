/**
 * 
 */
package es.indra.aerolineas.beans;


	public class Persona {
	
	protected String nombre;
	protected int id;
	protected String apellido; 
	protected String dni;


	public Persona() {
	super();
}
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