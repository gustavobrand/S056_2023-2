package aula11;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		System.out.println(c.soma(1, 2));
		System.out.println(c.soma(1f, 2f));
		System.out.println(c.soma(1d, 2f));
		System.out.println(c.soma(1d, 2d));
		System.out.println(c.soma(1, 2f));
		System.out.println(c.soma(1, 2f, 5));
		System.out.println(c.soma(1, 2, 5));
		System.out.println(c.soma(1f, 2f, 5));
		System.out.println(c.soma(1f, 2f, 5f));
		System.out.println(c.soma(1d, 2d, 5f));
		System.out.println(c.soma(1d, 2d, 5d));
	}

}
