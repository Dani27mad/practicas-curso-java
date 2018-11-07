package es.indra.aerolineas.services;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
	
	public  List<String> retornarVuelos()
	{
		Path link = Paths.get("/Users/aula12/repositorios/CursoJava//vuelos.txt");			
		try {
			return Files.readAllLines(link);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main (String[] args)
	{
		ReadFile r = new ReadFile();
		r.retornarVuelos();
		
	}

}
