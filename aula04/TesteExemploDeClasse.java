package aula04;

public class TesteExemploDeClasse {

	public static void main(String[] args) {
		
		ExemploDeClasse p1 = new ExemploDeClasse();
		p1.nome = "Ma�a";
		p1.preco = 4.0f;
		p1.descricao = "Ma�a Fuji";
		
		p1.mostraDescricaoProduto();
		System.out.println("Nome do Produto: " + p1.mostraNomeProduto());
		System.out.println("Pre�o do Produto: " + p1.mostraPreco());
	}

}
