import java.util.List;
import java.util.ArrayList;

public class Limite<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;

	}
	
	public <U extends Number> void revision(U u) {
		System.out.println("T es de tipo "+ t.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<? super Integer> lista5 = new ArrayList<>();
		
		
		Limite<Integer> lim = new Limite<>();
		lim.setT(34);
		System.out.println(lim.getT());
		
		lim.revision(35);

		Limite<String> lim2 = new Limite<>();
		lim2.setT("Hola");
		System.out.println(lim2.getT());
		//lim2.revision("String");

	}

}