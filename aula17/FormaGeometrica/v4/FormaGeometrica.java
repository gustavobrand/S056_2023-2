package aula17.FormaGeometrica.v4;

public abstract class FormaGeometrica {
	protected String nome;
	protected float area;
	
	public FormaGeometrica(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "FormaGeometrica [nome=" + nome + ", area=" + area + "]";
	}
}
