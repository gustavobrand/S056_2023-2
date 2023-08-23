package aula05;

public class TesteTelefone {

	public static void main(String[] args) {
		Telefone fone1 = new Telefone();
		Telefone fone2 = new Telefone();
		
		fone1.setNumeroTelefone("51933446677");
		fone1.setOperadora("Tim");		
		fone2.setNumeroTelefone("51944335522");
		fone2.setOperadora("Claro");
		
		System.out.println(fone1.getNumeroTelefone());
		System.out.println(fone1.getOperadora());
		System.out.println(fone2.getNumeroTelefone());
		System.out.println(fone2.getOperadora());
	}
}
