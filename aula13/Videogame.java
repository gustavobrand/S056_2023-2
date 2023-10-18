package aula13;

public class Videogame extends ProdutoEletronico {
	private int nroControles;

	public Videogame(String nome, float preco, String marca, int nroControles) {
		super(nome, preco, marca);
		this.nroControles = nroControles;
	}

	public int getNroControles() {
		return nroControles;
	}
	public void setNroControles(int nroControles) {
		this.nroControles = nroControles;
	}

	@Override
	public String toString() {
		return "Videogame [nroControles=" + nroControles + ", nome=" + nome + ", preco=" + preco + ", marca=" + marca
				+ "]";
	}
	
}
