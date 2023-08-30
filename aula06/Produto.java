package aula06;

public class Produto {
	private String nome;
	private float preco;
	private String descricao;
	
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = "";
	}
	
	public Produto(String nome, float preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", preco: R$" + preco + 
				", desc.: " + descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(preco);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
			return false;
		return true;
	}
	
	
	
}
