package aula03;

public class exemploFuncao {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int result = somar (a, b);
		System.out.println("Resultado: " + result);

	}
	
	public static int somar (int a, int b) {
		int result = a+b;
		return result;
	}

}
