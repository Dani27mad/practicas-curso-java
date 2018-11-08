/**
 * 
 */
package es.imprimir.pruebahilos;

/**
 * @author aula12
 *
 */
public class sumArray {

	/**
	 * @param args
	 */
	private int sum;

	// sumArray est� sincronizado
	synchronized int sumArray(int nums[]) {
		sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Total acumulado de " + Thread.currentThread().getName() + " es " + sum);
			try {
				Thread.sleep(10);// permitir el cambio de tarea
			} catch (InterruptedException exc) {
				System.out.println("Hilo interrumpido");
			}
		}
		return sum;
	}
}