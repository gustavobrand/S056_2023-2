package aula08;

import java.util.ArrayList;

public class TesteMae3 {

	public static void main(String[] args) {
		ArrayList<Filho> filhosTeste;
		filhosTeste = new ArrayList<Filho>();
				
		filhosTeste.add(new Filho("Joao"));
		filhosTeste.add(new Filho("Maria"));
		filhosTeste.add(new Filho("Jose"));
		filhosTeste.add(new Filho("Juliana"));
		
		for (Filho f : filhosTeste) {
			System.out.println(f);
		}
		

	}

}
