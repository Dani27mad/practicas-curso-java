import java.util.ArrayList;
import java.util.List;

public class GenericsDesconocido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listado = new ArrayList<>();
		
		listado.add(23);
		listado.add(45);
		
		List <? extends Number> listadoDesconocido = new ArrayList<>();
		
		listadoDesconocido.add(new Integer(34), null);
		//listadoDesconocido.add(35.45d);

	}

}
