package aula13;

public class ContaBasica extends ContaBanco {
	private float TaxaAdministrativaMensal;

	public ContaBasica(String nroConta, int agencia,
			String nomeCliente, float taxaAdministrativaMensal) {
		super(nroConta, agencia, 0, nomeCliente, 0, 10);
		TaxaAdministrativaMensal = taxaAdministrativaMensal;
	}

	public float getTaxaAdministrativaMensal() {
		return TaxaAdministrativaMensal;
	}
	public void setTaxaAdministrativaMensal(float taxaAdministrativaMensal) {
		TaxaAdministrativaMensal = taxaAdministrativaMensal;
	}

	@Override
	public String toString() {
		return "ContaBasica [TaxaAdministrativaMensal=" + TaxaAdministrativaMensal + ", nroConta=" + nroConta
				+ ", agencia=" + agencia + ", saldo=" + saldo + ", nomeCliente=" + nomeCliente + ", limite=" + limite
				+ ", juros=" + juros + "]";
	}
	
}
