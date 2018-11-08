/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaDeArchivosExceptions;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 */
public class Aerolinea implements IAerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	private ReadFile archivo = new ReadFile();
	private Pasajero billete = new Pasajero();

	
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.impl.IAerolinea#getNombre()
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.impl.IAerolinea#getVuelos()
	 */
	@Override
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	
	Vuelo vuelo = new Vuelo(id);
	
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#consultarVuelos(java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen)
	{
		 System.out.println("El origen del vuelo es: ".concat(origen));
		 
			 //String bruto = archivo.retornarVuelos();
		
			 
	}
	
	@Override
	public void consultarVuelos() throws ErrorLecturaDeArchivosExceptions
	{
		
		  List<String> contenido = archivo.retornarVuelos();
		  
		  if(contenido!=null && !contenido.isEmpty())
		  {
			for (int i=0;i<=contenido.size()-1;i++)
			{
				System.out.println(contenido.get(i));
			}
		  }else
		  {
			  System.out.println("No se encontraron vuelos");
		  }
	}
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#consultarVuelos(java.lang.String, java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen, String destino)
	{
		 System.out.printf("El origen y el destino del vuelo es, respectivamente %s y %s %n",origen,destino);


	}
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#anularVuelos(java.lang.String)
	 */
	@Override
	public void anularVuelos(String... nada)
	{
		System.out.println("Número de vuelos a anular es, " + nada	.length);
	}
	
	public void consultarBilletes(int id,String[] pasajero)
	{
		Map<Integer, String[]> billeteFin = new HashMap<Integer, String[]>(); 
		
		billeteFin.put(id,pasajero);
		
		Iterator it = billeteFin.keySet().iterator();
		while(it.hasNext()){
			  Integer key = (Integer) it.next();
			  System.out.println("Clave: " + key + " -> Valor: " + billeteFin.get(key));
			}		

	}
	
	

}
