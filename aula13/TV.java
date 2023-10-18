package aula13;

public class TV extends ProdutoEletronico {
	private int tamanho;
	private String tipo; // LCD/LED/OLED
	
	public TV(String nome, float preco, String marca, int tamanho, String tipo) {
		super(nome, preco, marca);
		this.tamanho = tamanho;
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TV [tamanho=" + tamanho + ", tipo=" + tipo + ", nome=" + nome + ", preco=" + preco + ", marca=" + marca
				+ "]";
	}
	
}
