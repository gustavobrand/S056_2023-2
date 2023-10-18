package aula13;

public class TesteContaBanco {

	public static void main(String[] args) {
		ContaBasica cbasica = new ContaBasica("000112233-4", 332, "Jose", 10f);
		ContaPadrao cpadrao = new ContaPadrao("000112234-5", 333, "Maria", 1000);
		ContaPremium cpremium = new ContaPremium("000112235-6", 334, "Joao", 500f); 
		
		System.out.println(cbasica);
		System.out.println(cpadrao);
		System.out.println(cpremium);
	}

}
