package aula04;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora minhaCalculadora = new Calculadora();
		int x = 5;
		int y = 6;
		minhaCalculadora.somar(x, y);
		System.out.println("Operacao realizada: " + 
				minhaCalculadora.ultimaOperacao());
		System.out.println("Resultado: " + 
				minhaCalculadora.ultimoResultado());
		
		minhaCalculadora.subtrair(x, y);
		System.out.println("Operacao realizada: " + 
				minhaCalculadora.ultimaOperacao());
		System.out.println("Resultado: " + 
				minhaCalculadora.ultimoResultado());

	}

}
