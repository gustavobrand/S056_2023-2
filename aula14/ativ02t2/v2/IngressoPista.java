package aula14.ativ02t2.v2;

public class IngressoPista extends Ingresso {

	public IngressoPista() {
		super(40f, "na pista");
	}
	
	@Override
	public String toString() {
		return "Ingresso Pista [valor=" + valor + ", descricao=" + descricao + "]";
	}
}
