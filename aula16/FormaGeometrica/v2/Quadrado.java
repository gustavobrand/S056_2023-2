package aula16.FormaGeometrica.v2;

public class Quadrado extends FormaGeometrica {
	private float lado;
	
	public Quadrado(String nome, float lado) {
		super(nome);
		this.lado = lado;
	}
	@Override
	public float totalArea() {
		area = lado*lado;
		return area;
	}

}
