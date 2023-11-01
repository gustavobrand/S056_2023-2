package aula15.ativ03t2.v3;

public class ModeloXYZ extends Modem {
	public enum PerfilPortaFibra {
		FASTETHERNET,
		GIGABIT
	}
	private PerfilPortaFibra velocidadePortaFibra;

	public ModeloXYZ(String nome, float velocidade, PerfilPortaFibra velocidadePortaFibra) {
		super(nome, "XYZ", velocidade, 4);
		this.velocidadePortaFibra = velocidadePortaFibra;
	}
	
	public String perfilDeVelocidade() {
		if (velocidadePortaFibra.equals(PerfilPortaFibra.FASTETHERNET)) {
			return "Baixa velocidade";
		} else if (velocidadePortaFibra.equals(PerfilPortaFibra.GIGABIT)) {
			return "Alta velocidade";
		}
		return "Velocidade desconhecida";
	}

	public PerfilPortaFibra getVelocidadePortaFibra() {
		return velocidadePortaFibra;
	}

	public void setVelocidadePortaFibra(PerfilPortaFibra velocidadePortaFibra) {
		this.velocidadePortaFibra = velocidadePortaFibra;
	}

	@Override
	public String toString() {
		return "ModeloXYZ [velocidadePortaFibra=" + velocidadePortaFibra + ", nome=" + nome + ", modelo=" + modelo
				+ ", velocidade=" + velocidade + ", nroPortasEthernet=" + nroPortasEthernet + "]";
	}
	
}
