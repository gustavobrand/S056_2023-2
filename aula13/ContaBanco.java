package aula13;

public class ContaBanco {
	protected String nroConta;
	protected int agencia;
	protected float saldo;
	protected String nomeCliente;
	protected float limite;
	protected float juros;
	
	public ContaBanco(String nroConta, int agencia, float saldo, 
			String nomeCliente, float limite, float juros) {
		this.nroConta = nroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
		this.limite = limite;
		this.juros = juros;
	}

	public String getNroConta() {
		return nroConta;
	}

	public void setNroConta(String nroConta) {
		this.nroConta = nroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public float getLimite() {
		return limite;
	}
	public float getJuros() {
		return juros;
	}

	@Override
	public String toString() {
		return "ContaBanco [nroConta=" + nroConta + ", agencia=" + agencia + ", saldo=" + saldo + ", nomeCliente="
				+ nomeCliente + ", limite=" + limite + ", juros=" + juros + "]";
	}
		
}
