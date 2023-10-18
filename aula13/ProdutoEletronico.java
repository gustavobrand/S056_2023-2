package aula13;

public class ProdutoEletronico {
	
	protected String nome;
	protected float preco;
	protected String marca;
	
	public ProdutoEletronico(String nome, float preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "ProdutoEletronico [nome=" + nome + ", preco=" + preco + ", marca=" + marca + "]";
	}
	

}
