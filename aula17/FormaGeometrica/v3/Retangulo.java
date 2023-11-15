package aula17.FormaGeometrica.v3;

public class Retangulo extends FormaGeometrica {
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
