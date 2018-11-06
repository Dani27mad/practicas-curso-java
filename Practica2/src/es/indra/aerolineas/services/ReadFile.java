package es.indra.aerolineas.services;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
	
	public void retornarVuelos()
	{
		Path link = Paths.get("/Users/aula10/repositorios/CursoJava/CursoJava/vuelos.txt");		
		
		try {
			List<String> contenido =  Files.readAllLines(link);
			System.out.println(contenido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main (String[] args)
	{
		ReadFile r = new ReadFile();
		r.retornarVuelos();
		
	}

}
