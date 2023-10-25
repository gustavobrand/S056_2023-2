package aula14.ativ02t2.v2;

public class Ingresso {
	protected float valor;
	protected String descricao;
	
	public Ingresso(float valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + ", descricao=" + descricao + "]";
	}
}
