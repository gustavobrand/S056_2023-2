package aula17.FormaGeometrica.v3;

public abstract class FormaGeometrica implements Formas {
	protected String nome;
	protected float area;
	
	//public abstract float totalArea();
	
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
