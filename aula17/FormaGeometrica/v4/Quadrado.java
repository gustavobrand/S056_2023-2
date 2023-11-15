package aula17.FormaGeometrica.v4;

public class Quadrado extends FormaGeometrica implements Formas {
	private float lado;
	
	public Quadrado(String nome, float lado) {
		super(nome);
		this.lado = lado;
		totalArea();
	}
	@Override
	public float totalArea() {
		area = lado*lado;
		return area;
	}

}
