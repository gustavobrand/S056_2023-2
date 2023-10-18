package aula13;

public class ContaPremium extends ContaBanco {
	private float ValorEmInvestimentos;

	public ContaPremium(String nroConta, int agencia,  
			String nomeCliente, float valorEmInvestimentos) {
		super(nroConta, agencia, 0, nomeCliente, 5000, 1);
		ValorEmInvestimentos = valorEmInvestimentos;
	}

	public float getValorEmInvestimentos() {
		return ValorEmInvestimentos;
	}
	public void setValorEmInvestimentos(float valorEmInvestimentos) {
		ValorEmInvestimentos = valorEmInvestimentos;
	}

	@Override
	public String toString() {
		return "ContaPremium [ValorEmInvestimentos=" + ValorEmInvestimentos + ", nroConta=" + nroConta + ", agencia="
				+ agencia + ", saldo=" + saldo + ", nomeCliente=" + nomeCliente + ", limite=" + limite + ", juros="
				+ juros + "]";
	}
	
}
