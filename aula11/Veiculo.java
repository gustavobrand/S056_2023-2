package aula11;

public class Veiculo {
	protected String Placa;
	protected String Modelo;
	private String Marca;
	private int Ano;
	private String Cor; 
	private String Proprietario; // TODO: composicao com classe Pessoa
	private int CapTanque;
	private String TipoFreio;
	// TODO: subir potencia para a superclasse e sobrecarregar os 
	//       métodos getPotencia e getCilindrada
	
	public Veiculo(String placa, String modelo, String marca, 
			int ano, String cor, String proprietario, int capTanque,
			String tipoFreio) {
		Placa = placa;
		Modelo = modelo;
		Marca = marca;
		Ano = ano;
		Cor = cor;
		Proprietario = proprietario;
		CapTanque = capTanque;
		TipoFreio = tipoFreio;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getProprietario() {
		return Proprietario;
	}
	public void setProprietario(String proprietario) {
		Proprietario = proprietario;
	}
	public int getCapTanque() {
		return CapTanque;
	}
	public void setCapTanque(int capTanque) {
		CapTanque = capTanque;
	}
	public String getTipoFreio() {
		return TipoFreio;
	}
	public void setTipoFreio(String tipoFreio) {
		TipoFreio = tipoFreio;
	}
	
	@Override
	public String toString() {
		return "Veiculo [Placa=" + Placa + ", Modelo=" + Modelo + ", Marca=" + Marca + ", Ano=" + Ano + ", Cor=" + Cor
				+ ", Proprietario=" + Proprietario + ", CapTanque=" + CapTanque + ", TipoFreio=" + TipoFreio + "]";
	}
}
