
public class Limite2 <K,V> implements Pair<K,V> {

	private K key;
	private V value;
	
	public Limite2(K key, V value) {
		this.key = key;
		this.value =value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	public static void main(String[] args) {

		Limite2<Integer, String> lim2 = new Limite2<>(1,"Rojo");
		Limite2<Integer, String> lim1 = new Limite2<>(4,"Azul");
		
		System.out.println(lim2.getKey());

	}

}
