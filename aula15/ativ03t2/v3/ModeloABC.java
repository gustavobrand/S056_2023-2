package aula15.ativ03t2.v3;

public class ModeloABC extends Modem {
	public enum TipoPortaCoaxial {
		DEZBASE2, 
		DEZBASE5
	}
	private TipoPortaCoaxial tipoPortaCoaxial;
	private float velocidadePortaCoaxial;
	
	public ModeloABC(String nome, String modelo, float velocidade, 
			TipoPortaCoaxial tipoPortaCoaxial, float velocidadePortaCoaxial) {
		super(nome, modelo, velocidade, 2);
		this.tipoPortaCoaxial = tipoPortaCoaxial;
		this.velocidadePortaCoaxial = velocidadePortaCoaxial;
	}

	public String tipoDoCaboCoaxial() {
		if (tipoPortaCoaxial.equals(TipoPortaCoaxial.DEZBASE2)) {
			return "FINO";
		} else if (tipoPortaCoaxial.equals(TipoPortaCoaxial.DEZBASE5)) {
			return "GROSSO";
		}
		return "DESCONHECIDO";
	}
	
	public TipoPortaCoaxial getTipoPortaCoaxial() {
		return tipoPortaCoaxial;
	}

	public void setTipoPortaCoaxial(TipoPortaCoaxial tipoPortaCoaxial) {
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
