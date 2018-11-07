package colecciones;

import java.util.HashMap;
import java.util.Map;

public class MapasDemos {

	public static void main(String[] args) {

		Map <String, String> estudiantes = new HashMap<>();
		
		estudiantes.put("Pérez", "Isabel");
		estudiantes.put("Molina", "Marco");
		estudiantes.put("Chao", "Maria");
		estudiantes.put("Menendéz", "Belén");
		estudiantes.put("Wilmot", "Bea");
		
		String prueba = "Prueba";
		
		System.out.println(estudiantes.size());
		
		for (Map.Entry<String, String> elemento : estudiantes.entrySet()) {
			
			System.out.println("Clave: " + elemento.getKey() + " y valor: " + elemento.getValue());
			
		}
				
	}
	


}
