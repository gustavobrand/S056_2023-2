package aula16.FormaGeometrica.v2;

public class Retangulo extends FormaGeometrica {
	private float lado, altura;

	public Retangulo(String nome, float lado, float altura) {
		super(nome);
		this.lado = lado;
		this.altura = altura;
	}
	@Override
	public float totalArea() {
		area = lado*altura;
		return area;
	}

}
