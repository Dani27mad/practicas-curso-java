package es.indra.aerolineas.exceptions;

public class ErrorLecturaDeArchivosExceptions extends Exception {

	public ErrorLecturaDeArchivosExceptions(String message) {
		
		super(message);
	}

	public ErrorLecturaDeArchivosExceptions(Throwable cause) {
		super(cause);
	}

	public ErrorLecturaDeArchivosExceptions(String message, Throwable cause) {
		super(message, cause);
		
	}


}
