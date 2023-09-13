package aula08;

public class Filho {
	private String nome;

	public Filho(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Filho [nome=" + nome + "]";
	}
	
}
