package aula08;

import java.util.ArrayList;

public class TesteArraylistString {

	public static void main(String[] args) {
		ArrayList<String> teste1;
		teste1 = new ArrayList<String>();
		
		String a1 = "Teste 001";
		String a2 = "Teste 002";
		teste1.add(a1);
		teste1.add(a2);
		teste1.add("Teste 003");
		
		for (String minhaStringDeTeste : teste1) {
			System.out.println(minhaStringDeTeste);
		}

	}

}
