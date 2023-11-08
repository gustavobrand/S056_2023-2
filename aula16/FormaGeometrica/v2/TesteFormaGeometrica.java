package aula16.FormaGeometrica.v2;

public class TesteFormaGeometrica {

	public static void main(String[] args) {
		Quadrado f1 = new Quadrado("Quad", 10f);
		Retangulo f2 = new Retangulo("Ret", 10f, 5f);
		Triangulo f3 = new Triangulo("Tri", 10f, 5f);
		System.out.println("Area quadrado: " + f1.totalArea());
		System.out.println("Area retangulo: " + f2.totalArea());
		System.out.println("Area triangulo: " + f3.totalArea());

	}

}
