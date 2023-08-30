package aula06;

public class TesteAtiv04_Pessoa {

	public static void main(String[] args) {
		ativ04_Pessoa p1 = new ativ04_Pessoa();
		ativ04_Pessoa p2 = new ativ04_Pessoa();
		
		p1.setNome("João");
		p1.setIdade(25);
		p1.setEndereco("Rua abc, 100");

		p2.setNome("Maria");
		p2.setIdade(25);
		p2.setEndereco("Rua xyz, 200");

		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Endereço: " + p1.getEndereco());
		
//		System.out.println("Nome: " + p2.getNome());
//		System.out.println("Idade: " + p2.getIdade());
//		System.out.println("Endereço: " + p2.getEndereco());

		System.out.printf("Nome: %s, Idade: %d, Endereço: %s\n",
				p2.getNome(), p2.getIdade(), p2.getEndereco());
	}
}
