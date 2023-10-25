package aula14.ativ02t2.v3;

public class IngressoBackstage extends Ingresso {
	
	public IngressoBackstage() {
		super(100f);
	}
	
	public String getDescricao() {
		return "Ingresso BackStage - perto do palco. Valor: R$" + getValor();
	}

}
