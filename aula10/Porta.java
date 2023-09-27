package aula10;

public class Porta {
	private String cor;
	private int tamanho;
	
	public Porta(String cor, int tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Porta [cor=" + cor + ", tamanho=" + tamanho + "]";
	}

}
