package aula12;

public class Endereco {
	private String rua;
	private int nro;
	private String cidade;
	
	public Endereco(String rua, int nro, String cidade) {
		this.rua = rua;
		this.nro = nro;
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", nro=" + nro + ", cidade=" + cidade + "]";
	}
	
}
