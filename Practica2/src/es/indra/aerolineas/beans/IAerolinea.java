package es.indra.aerolineas.beans;


import es.indra.aerolineas.beans.impl.Vuelo;
import es.indra.aerolineas.exceptions.ErrorLecturaDeArchivosExceptions;

public interface IAerolinea {

	void consultarVuelos(String origen);

	void consultarVuelos(String origen, String destino);

	void anularVuelos(String... nada);

	String getNombre();

	Vuelo[] getVuelos();

	void consultarVuelos() throws ErrorLecturaDeArchivosExceptions;

}