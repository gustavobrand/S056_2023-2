package aula14.ativ02t2.v2;

public class IngressoBackstage extends Ingresso {
	
	public IngressoBackstage() {
		super(100f, "perto do palco");
	}
	
	@Override
	public String toString() {
		return "Ingresso BackStage [valor=" + valor + ", descricao=" + descricao + "]";
	}
}
