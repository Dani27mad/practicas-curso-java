package es.indra.aerolineas.beans.impl;

import java.util.Scanner;

public class Billetes {

protected int id;
protected int Nombre;
protected int NumeroAsiento;
Scanner entrada = new Scanner(System.in);
 

public void pedirDatos() {
	
	System.out.println("Dame");
	id = entrada.nextInt();
	System.out.println("dame otro valor");
	Nombre = entrada.nextInt();
	System.out.println("dame otro valor");
	NumeroAsiento = entrada.nextInt();
	System.out.println("dame otro valor");
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getNombre() {
	return Nombre;
}


public void setNombre(int nombre) {
	Nombre = nombre;
}


public int getNumeroAsiento() {
	return NumeroAsiento;
}


public void setNumeroAsiento(int numeroAsiento) {
	NumeroAsiento = numeroAsiento;
}


public Scanner getEntrada() {
	return entrada;
}


public void setEntrada(Scanner entrada) {
	this.entrada = entrada;
}

	
}
