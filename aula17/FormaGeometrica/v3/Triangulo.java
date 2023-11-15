package aula17.FormaGeometrica.v3;

public class Triangulo extends FormaGeometrica {
	private float base, altura;
	public Triangulo(String nome, float base, float altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
		totalArea();
	}
	@Override
	public float totalArea() {
		area = (base*altura)/2;
		return area;
	}	

}
