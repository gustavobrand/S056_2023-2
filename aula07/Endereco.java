package aula07;

public class Endereco {
	private String rua;
	private int nro;
	private String complemento;
	private String bairro, cidade, cep, estado, pais;
	
	public Endereco() {}
	public Endereco(String rua, int nro, 
			String complemento, String cidade) {
		this.rua = rua;
		this.nro = nro;
		this.complemento = complemento;
		this.cidade = cidade;
	}

	public Endereco(String rua, int nro, String complemento, 
			String bairro, String cidade, String cep, 
			String estado, String pais) {
		this.rua = rua;
		this.nro = nro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
		this.pais = pais;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", nro=" + nro + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", pais=" + pais + "]";
	}
	
}
