package aula14.ativ02t2.v3;

public class IngressoVip extends Ingresso {

	public IngressoVip() {
		super(70f);
	}

	public String getDescricao() {
		return "Ingresso VIP - na frente do palco. Valor: R$" + getValor();
	}

}
