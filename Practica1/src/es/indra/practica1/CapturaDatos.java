package es.indra.practica1;

import java.util.Scanner;

import javax.swing.ImageIcon;

public class CapturaDatos {

	public static void main(String[] args) {
		Scanner salida = new Scanner(System.in);
		
		System.out.println("Introduzca un deseo: ");
		
		String deseo;
		deseo = salida.nextLine();
		
		System.out.println("Espera un momento mientras se cumple tu deseo de " +deseo);
		System.out.println("Y mientras se cumple, te dejamos una magn�fica frase de Paulo Cohelo: \n"
				+ "Nunca desistas de un sue�o. S�lo trata de ver las se�ales que te llevan a �l. \n"
				+ "Y, tambi�n otra de el gran Mr. Wonderful: �Hey! Tienes en tus manos una caja llena de Felicidad y buen rollete... DISFRUTA");
		
		

	}

}
