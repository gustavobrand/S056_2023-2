package aula12;

public class Carro extends Veiculo {
	private int NroPortas;
	private String TipoCambio;
	private String RevestBanco;
	private String TipoDirecao;
	private int Potencia;
	private int Lugares;
	private int CapPortaMalas;
	
	public Carro(String placa, String modelo, String marca, 
			int ano, String cor, String proprietario, int capTanque,
			String tipoFreio, int nroPortas, String tipoCambio, 
			String revestBanco, String tipoDirecao, int potencia,
			int lugares, int capPortaMalas) {
		
		super(placa, modelo, marca, ano, cor, proprietario, 
				capTanque, tipoFreio);
		NroPortas = nroPortas;
		TipoCambio = tipoCambio;
		RevestBanco = revestBanco;
		TipoDirecao = tipoDirecao;
		Potencia = potencia;
		Lugares = lugares;
		CapPortaMalas = capPortaMalas;
	}

	public int getNroPortas() {
		return NroPortas;
	}

	public void setNroPortas(int nroPortas) {
		NroPortas = nroPortas;
	}

	public String getTipoCambio() {
		return TipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		TipoCambio = tipoCambio;
	}

	public String getRevestBanco() {
		return RevestBanco;
	}

	public void setRevestBanco(String revestBanco) {
		RevestBanco = revestBanco;
	}

	public String getTipoDirecao() {
		return TipoDirecao;
	}

	public void setTipoDirecao(String tipoDirecao) {
		TipoDirecao = tipoDirecao;
	}

	public int getPotencia() {
		return Potencia;
	}

	public void setPotencia(int potencia) {
		Potencia = potencia;
	}

	public int getLugares() {
		return Lugares;
	}

	public void setLugares(int lugares) {
		Lugares = lugares;
	}

	public int getCapPortaMalas() {
		return CapPortaMalas;
	}
	public void setCapPortaMalas(int capPortaMalas) {
		CapPortaMalas = capPortaMalas;
	}

	@Override
	public String toString() {
		return "Carro [NroPortas=" + NroPortas + ", TipoCambio=" + TipoCambio + ", RevestBanco=" + RevestBanco
				+ ", TipoDirecao=" + TipoDirecao + ", Potencia=" + Potencia + ", Lugares=" + Lugares
				+ ", CapPortaMalas=" + CapPortaMalas + ", Placa=" + getPlaca() + ", Modelo=" + Modelo + ", Marca=" + Marca
				+ ", Ano=" + Ano + ", Cor=" + Cor + ", Proprietario=" + Proprietario + ", CapTanque=" + CapTanque
				+ ", TipoFreio=" + TipoFreio + "]" + super.toString();
	}

	public String toStringV2() {
		return super.toString() + "Carro [NroPortas=" + NroPortas + ", TipoCambio=" + TipoCambio + ", RevestBanco=" + RevestBanco
				+ ", TipoDirecao=" + TipoDirecao + ", Potencia=" + Potencia + ", Lugares=" + Lugares
				+ ", CapPortaMalas=" + CapPortaMalas;
	}
	
}
