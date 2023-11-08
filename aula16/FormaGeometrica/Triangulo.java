package aula16.FormaGeometrica;

public class Triangulo extends FormaGeometrica {
	// Idealmente teriamos as propriedades do
	// triangulo listadas aqui para calculo da area
	
	public Triangulo(String nome, float area) {
		super(nome, area);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float totalArea() {
		return area;
	}	

}
