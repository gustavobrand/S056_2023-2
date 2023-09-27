package aula10;

public class Janela {
	private int tamanho;

	public Janela(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Janela [tamanho=" + tamanho + "]";
	}
	
}
