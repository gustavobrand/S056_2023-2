package aula14.ativ02t2.v2;

public class IngressoVip extends Ingresso {

	public IngressoVip() {
		super(70f, "na frente do palco");
	}

	@Override
	public String toString() {
		return "Ingresso VIP [valor=" + valor + ", descricao=" + descricao + "]";
	}
}
