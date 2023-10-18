package aula13;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa    pessoa = new Pessoa("Joao", 1000f);
		Professor professor = new Professor("Maria", 1000f);
		Diretor   diretor = new Diretor("Jose", 1000f);
		
		System.out.println(pessoa.getSalario());
		System.out.println(professor.getSalario());
		System.out.println(diretor.getSalario());
	}

}
