package aula13;

public class ContaPadrao extends ContaBanco {
	private int PontosDeFidelidade;

	public ContaPadrao(String nroConta, int agencia,  
			String nomeCliente, int pontosDeFidelidade) {
		super(nroConta, agencia, 0, nomeCliente, 1000, 5);
		PontosDeFidelidade = pontosDeFidelidade;
	}

	public int getPontosDeFidelidade() {
		return PontosDeFidelidade;
	}
	public void setPontosDeFidelidade(int pontosDeFidelidade) {
		PontosDeFidelidade = pontosDeFidelidade;
	}

	@Override
	public String toString() {
		return "ContaPadrao [PontosDeFidelidade=" + PontosDeFidelidade + ", nroConta=" + nroConta + ", agencia="
				+ agencia + ", saldo=" + saldo + ", nomeCliente=" + nomeCliente + ", limite=" + limite + ", juros="
				+ juros + "]";
	}
	
}
