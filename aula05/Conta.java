package aula05;

public class Conta {
	private float saldo;
	
	public void depositar(float valor) {
		saldo += valor;
	}
	public void sacar(float valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
	}
	public void extrato() {
		System.out.println("Saldo: R$" + saldo);
	}
}
