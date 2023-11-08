package aula16.FormaGeometrica.v2;

public class Triangulo extends FormaGeometrica {
	private float base, altura;
	public Triangulo(String nome, float base, float altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public float totalArea() {
		area = (base*altura)/2;
		return area;
	}	

}
