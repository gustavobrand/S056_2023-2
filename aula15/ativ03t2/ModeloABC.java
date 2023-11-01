package aula15.ativ03t2;

public class ModeloABC extends Modem {
	private String tipoPortaCoaxial;
	private float velocidadePortaCoaxial;
	
	public ModeloABC(String nome, String modelo, float velocidade, 
			String tipoPortaCoaxial, float velocidadePortaCoaxial) {
		super(nome, modelo, velocidade, 2);
		this.tipoPortaCoaxial = tipoPortaCoaxial;
		this.velocidadePortaCoaxial = velocidadePortaCoaxial;
	}

	public String tipoDoCaboCoaxial() {
		if (tipoPortaCoaxial.equals("10base2")) {
			return "FINO";
		} else if (tipoPortaCoaxial.equals("10base5")) {
			return "GROSSO";
		}
		return "DESCONHECIDO";
	}
	
	public String getTipoPortaCoaxial() {
		return tipoPortaCoaxial;
	}

	public void setTipoPortaCoaxial(String tipoPortaCoaxial) {
		this.tipoPortaCoaxial = tipoPortaCoaxial;
	}

	public float getVelocidadePortaCoaxial() {
		return velocidadePortaCoaxial;
	}

	public void setVelocidadePortaCoaxial(float velocidadePortaCoaxial) {
		this.velocidadePortaCoaxial = velocidadePortaCoaxial;
	}

	@Override
	public String toString() {
		return "ModeloABC [tipoPortaCoaxial=" + tipoPortaCoaxial + ", velocidadePortaCoaxial=" + velocidadePortaCoaxial
				+ ", nome=" + nome + ", modelo=" + modelo + ", velocidade=" + velocidade + ", nroPortasEthernet="
				+ nroPortasEthernet + "]";
	}
	
}
