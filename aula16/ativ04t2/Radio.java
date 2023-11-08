package aula16.ativ04t2;

import aula16.ativ04t2.Tipos.TipoRadio;

public class Radio extends Produto {
	private int potenciaRMS;
	private TipoRadio tipo;
	
	public Radio(String nome, float preco, String marca, 
			     int potenciaRMS, TipoRadio tipo) {
		super(nome, preco, marca);
		this.potenciaRMS = potenciaRMS;
		this.tipo = tipo;
	}
	
	public int getPotenciaRMS() {
		return potenciaRMS;
	}
	public void setPotenciaRMS(int potenciaRMS) {
		this.potenciaRMS = potenciaRMS;
	}
	public TipoRadio getTipo() {
		return tipo;
	}
	public void setTipo(TipoRadio tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Radio [potenciaRMS=" + potenciaRMS + ", tipo=" + 
				tipo + ", nome=" + nome + ", preco=" + preco
				+ ", marca=" + marca + "]";
	}
	
}
