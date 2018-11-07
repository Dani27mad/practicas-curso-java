package es.indra.aerolineas.services;

import java.util.List;

import es.indra.aerolineas.exceptions.ErrorLecturaDeArchivosExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
	
	public  List<String> retornarVuelos() throws ErrorLecturaDeArchivosExceptions
	{
		Path link = Paths.get("/Users/aula12/repositorios/CursoJava//vuelos.txt");			
		try {
			return Files.readAllLines(link);	
		} catch (IOException e) {
			throw new ErrorLecturaDeArchivosExceptions("Fallo leyendo el archivo",e);
		}finally {
			System.out.println("Error de archivo");
		}
	}	
	
	public static void main (String[] args)
	{
		ReadFile r = new ReadFile();
		try {
			r.retornarVuelos();
		} catch (ErrorLecturaDeArchivosExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
