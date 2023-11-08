package aula16.ativ04t2;

import aula16.ativ04t2.Tipos.QuantControles;

public class Videogame extends Produto {
	private QuantControles nroControles;

	public Videogame(String nome, float preco, String marca, 
			         QuantControles nroControles) {
		super(nome, preco, marca);
		this.nroControles = nroControles;
	}

	public QuantControles getNroControles() {
		return nroControles;
	}
	public void setNroControles(QuantControles nroControles) {
		this.nroControles = nroControles;
	}

	@Override
	public String toString() {
		return "Videogame [nroControles=" + nroControles + 
				", nome=" + nome + ", preco=" + preco + 
				", marca=" + marca + "]";
	}
	
}
