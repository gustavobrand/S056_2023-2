package aula12;

public class TestePessoa {

	public static void main(String[] args) {
		Endereco endPf = new Endereco("Rua abc", 100, "Porto Alegre");
		PessoaFisica pf = new PessoaFisica("Joao", endPf, 51443344, 
				"111.111.111-11", "111111111111");
		System.out.println(pf.getNome());
		System.out.println(pf.getRg());
		System.out.println(pf.getEndereco().getCidade());
		System.out.println(pf);

		Endereco endPj = new Endereco("Rua Xyz", 200, "Porto Alegre");
		PessoaJuridica pj = new PessoaJuridica("Empresa ABC", endPj, 512323332, 
				"2222222222", "333333333");
		System.out.println(pj.getEndereco());
		System.out.println(pj.getCnpj());
		System.out.println(pj.getEndereco().getRua());
		System.out.println(pj);

	}

}
