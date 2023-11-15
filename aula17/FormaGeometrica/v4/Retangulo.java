package aula17.FormaGeometrica.v4;

public class Retangulo extends FormaGeometrica implements Formas {
	private float lado, altura;

	public Retangulo(String nome, float lado, float altura) {
		super(nome);
		this.lado = lado;
		this.altura = altura;
		totalArea();
	}
	@Override
	public float totalArea() {
		area = lado*altura;
		return area;
	}

}
