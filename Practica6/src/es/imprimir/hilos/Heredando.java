package es.imprimir.hilos;

import java.util.Set;

public class Heredando extends Thread {

	public void run() {
		
		super.run();
	
		
		System.out.println("dendro run");

		if (getName().equals("hilo1")){
				try {
					sleep(3000);
					System.out.println("por fin despierto!!!");
					
					
				}catch(InterruptedException e) {
					
				}
				
	}
		else {
		System.out.println("soy 0".concat(getName()) );}
		}
	public static void main(String[] args) {
		
		Heredando h = new Heredando();
		h.setName("hilo1");
		h.start();
		
		
		Heredando h2 = new Heredando();
		h2.setName("hilo2");
		h2.start();
		
		Heredando h3 = new Heredando();
		h3.setName("hilo3");
		h3.start();
		
		System.out.println("hilos" + Heredando.activeCount());

		Set<Thread> hilos=Heredando.getAllStackTraces().keySet();
		
		for (Thread hilo : hilos) {
			StringBuilder sb =new StringBuilder();
			
			sb.append("\"" + hilo.getName());
			sb.append(":");
			sb.append(hilo.getPriority());
			sb.append("\"");
			sb.append(hilo.isDaemon());
			sb.append(",");
			sb.append(hilo.getState());
			
			System.out.println("\t" + sb);
			
		}
	}
}
