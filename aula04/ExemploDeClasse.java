package aula04;

public class ExemploDeClasse {
	String nome;
	float preco;
	String descricao;
	
	String mostraNomeProduto() {
		return nome;
	}
	float mostraPreco() {
		return preco;
	}
	void mostraDescricaoProduto() {
		System.out.println("Descricao do produto: " + descricao);
	}
}
