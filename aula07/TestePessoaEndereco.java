package aula07;

public class TestePessoaEndereco {

	public static void main(String[] args) {
		
		// Exemplo 1: com construtores inicializando os atributos
		Endereco e1 = new Endereco("Rua Abc", 100, 
				"Apto 101", "Porto Alegre");		
		Pessoa p1 = new Pessoa("Jo�o", e1);
		System.out.println(p1.getNome() + ", " + 	
			p1.getEnd().getRua() + ", " + p1.getEnd().getNro() + ", " +
			p1.getEnd().getComplemento() + ", " + p1.getEnd().getCidade());
		System.out.println(p1.getEnd());
		System.out.println(p1);
		
		// Exemplo 2: com construtores padr�o somente
		Endereco e2 = new Endereco();
		e2.setRua("Rua Abc");
		e2.setNro(100);
		e2.setComplemento("Apto 101");
		e2.setCidade("Porto Alegre");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Jo�o");
		p2.setEnd(e2);

	}

}
