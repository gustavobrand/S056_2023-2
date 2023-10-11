package aula12;

public class Moto extends Veiculo {
	private int Cilindrada;
	private String TipoMoto;
	private String TipoPartida;
	private boolean Carenagem;
	
	public Moto(String placa, String modelo, String marca, int ano, 
			String cor, String proprietario, int capTanque,
			String tipoFreio, int cilindrada, String tipoMoto, 
			String tipoPartida, boolean carenagem) {
		
		super(placa, modelo, marca, ano, cor, proprietario, capTanque, 
				tipoFreio);
		Cilindrada = cilindrada;
		TipoMoto = tipoMoto;
		TipoPartida = tipoPartida;
		Carenagem = carenagem;
	}

	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

	public String getTipoMoto() {
		return TipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		TipoMoto = tipoMoto;
	}

	public String getTipoPartida() {
		return TipoPartida;
	}

	public void setTipoPartida(String tipoPartida) {
		TipoPartida = tipoPartida;
	}

	public boolean isCarenagem() {
		return Carenagem;
	}

	public void setCarenagem(boolean carenagem) {
		Carenagem = carenagem;
	}

	@Override
	public String toString() {
		return "Moto [Cilindrada=" + Cilindrada + ", TipoMoto=" + TipoMoto + ", TipoPartida=" + TipoPartida
				+ ", Carenagem=" + Carenagem + ", Modelo=" + Modelo + ", Marca=" + Marca + ", Ano=" + Ano + ", Cor="
				+ Cor + ", Proprietario=" + Proprietario + ", CapTanque=" + CapTanque + ", TipoFreio=" + TipoFreio
				+ ", getPlaca()=" + getPlaca() + "]";
	}

	
		
}
