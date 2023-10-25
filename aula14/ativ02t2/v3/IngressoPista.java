package aula14.ativ02t2.v3;

public class IngressoPista extends Ingresso {

	public IngressoPista() {
		super(40f);
	}

	public String getDescricao() {
		return "Ingresso Pista - na pista. Valor: R$" + getValor();
	}

}
