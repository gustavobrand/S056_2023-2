package aula06;

public class Computador {
	private String nome;
	private int clock;
	
	public Computador() {}
	
	public Computador(String nome, int clock) {
		this.nome = nome;
		this.clock = clock;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}
}
