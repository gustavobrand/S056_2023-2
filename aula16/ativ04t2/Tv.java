package aula16.ativ04t2;

import aula16.ativ04t2.Tipos.TipoTelevisao;

public class Tv extends Produto {
	private int tamanho;
	private TipoTelevisao tipo;
	
	public Tv(String nome, float preco, String marca, 
			  int tamanho, TipoTelevisao tipo) {
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
	public TipoTelevisao getTipo() {
		return tipo;
	}
	public void setTipo(TipoTelevisao tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Tv [tamanho=" + tamanho + ", tipo=" + tipo + 
				", nome=" + nome + ", preco=" + preco + 
				", marca=" + marca + "]";
	}
	
}
