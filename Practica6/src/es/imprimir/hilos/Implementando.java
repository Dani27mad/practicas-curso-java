package es.imprimir.hilos;

public class Implementando implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		System.out.println("dentro de run rumble");
		
			
		}
	public static void main(String[] args) {
			Implementando i = new Implementando();
			i.run();
	}

}
