package aula16.FormaGeometrica;

public class Quadrado extends FormaGeometrica {
	
	public Quadrado(String nome, float area) {
		super(nome, area);
	}

	@Override
	public float totalArea() {
		return area;
	}

}
