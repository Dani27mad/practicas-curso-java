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
		System.out.println("Y mientras se cumple, te dejamos una magnífica frase de Paulo Cohelo: \n"
				+ "Nunca desistas de un sueño. Sólo trata de ver las señales que te llevan a él. \n"
				+ "Y, también otra de el gran Mr. Wonderful: ¡Hey! Tienes en tus manos una caja llena de Felicidad y buen rollete... DISFRUTA");
		
		

	}

}
