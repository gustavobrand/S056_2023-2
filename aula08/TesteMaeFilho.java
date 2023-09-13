package aula08;

public class TesteMaeFilho {

	public static void main(String[] args) {
		Filho f1 = new Filho("João");
		Filho f2 = new Filho("Maria");
		Mae m1 = new Mae("Juliana", f1, f2);
		
		System.out.println(m1);
		System.out.println(m1.getFilho1());
		System.out.println(m1.getFilho2());
	}

}
