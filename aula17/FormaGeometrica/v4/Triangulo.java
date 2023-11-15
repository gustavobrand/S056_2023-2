package aula17.FormaGeometrica.v4;

public class Triangulo extends FormaGeometrica implements Formas {
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
