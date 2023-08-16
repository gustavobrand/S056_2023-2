package aula04;

public class TesteExemploDeClasse {

	public static void main(String[] args) {
		
		ExemploDeClasse p1 = new ExemploDeClasse();
		p1.nome = "Maça";
		p1.preco = 4.0f;
		p1.descricao = "Maça Fuji";
		
		p1.mostraDescricaoProduto();
		System.out.println("Nome do Produto: " + p1.mostraNomeProduto());
		System.out.println("Preço do Produto: " + p1.mostraPreco());
	}

}
