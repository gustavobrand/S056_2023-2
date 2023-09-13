package aula08;

import java.util.ArrayList;

public class TesteMae2 {

	public static void main(String[] args) {
		ArrayList<Filho> filhosTeste;
		filhosTeste = new ArrayList<Filho>();
		
		Filho f1 = new Filho("Joao");
		Filho f2 = new Filho("Maria");
		Filho f3 = new Filho("Jose");
		Filho f4 = new Filho("Juliana");
		
		filhosTeste.add(f1);
		filhosTeste.add(f2);
		filhosTeste.add(f3);
		filhosTeste.add(f4);
		
		for (Filho f : filhosTeste) {
			System.out.println(f);
		}
		
		Mae2 m2 = new Mae2("Janaina", filhosTeste);
		System.out.println(m2);
		
		Mae2 m3 = new Mae2("Janaina");
		m3.setFilhos(filhosTeste);
		System.out.println(m3);
		
		Mae2 m4 = new Mae2("Janaina");
		m4.getFilhos().add(new Filho("Joao"));
		m4.adicionarFilho(new Filho("Maria"));
		
		
		
		
		

	}

}
