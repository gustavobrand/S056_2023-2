package aula15.ativ03t2.v2;

public class ModeloXYZ extends Modem {
	private float velocidadePortaFibra;

	public ModeloXYZ(String nome, float velocidade, float velocidadePortaFibra) {
		super(nome, "XYZ", velocidade, 4);
		this.velocidadePortaFibra = velocidadePortaFibra;
	}
	
	public String perfilDeVelocidade() {
		if (velocidadePortaFibra > 1000f) {
			return "Alta velocidade";
		}
		return "Baixa velocidade";
	}

	public float getVelocidadePortaFibra() {
		return velocidadePortaFibra;
	}

	public void setVelocidadePortaFibra(float velocidadePortaFibra) {
		this.velocidadePortaFibra = velocidadePortaFibra;
	}

	@Override
	public String toString() {
		return "ModeloXYZ [velocidadePortaFibra=" + velocidadePortaFibra + ", nome=" + nome + ", modelo=" + modelo
				+ ", velocidade=" + velocidade + ", nroPortasEthernet=" + nroPortasEthernet + "]";
	}
	
}
