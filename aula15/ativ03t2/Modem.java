package aula15.ativ03t2;

public class Modem {
	protected String nome;
	protected String modelo;
	protected float velocidade;
	protected int nroPortasEthernet;
	
	public Modem(String nome, String modelo, float velocidade, int nroPortasEthernet) {
		this.nome = nome;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.nroPortasEthernet = nroPortasEthernet;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public int getNroPortasEthernet() {
		return nroPortasEthernet;
	}

	public void setNroPortasEthernet(int nroPortasEthernet) {
		this.nroPortasEthernet = nroPortasEthernet;
	}

	@Override
	public String toString() {
		return "Modem [nome=" + nome + ", modelo=" + modelo + ", velocidade=" + velocidade + ", nroPortasEthernet="
				+ nroPortasEthernet + "]";
	}
	
}
