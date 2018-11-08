package es.indra.aerolineas.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import es.indra.aerolineas.beans.impl.Pasajero;

public class WriteFile {
	
	public void  escribirfichero(Pasajero p){
		
		File archivo = new File("pasajero.txt");
		try {
			FileWriter escrito = new FileWriter(archivo);
			
			escrito.write(p.toString());
			escrito.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		
		
		
		
		
	}
	

}
