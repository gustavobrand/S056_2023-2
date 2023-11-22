package aula17.Padaria.v1;

public abstract class Produto {
	protected String nome;
	protected float precoUnidade;
	protected String marca;
	
	public Produto(String nome, float preco, String marca) {
		this.nome = nome;
		this.precoUnidade = preco;
		this.marca = marca;
	}
	
	public abstract void descricao();

	public float getPrecoUnidade() {
		return precoUnidade;
	} 

	
	//TODO: implementar gets/sets/toString
	
}
