package aula03;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("valor 1: ");
		int val1 = entrada.nextInt();
		System.out.print("valor 2: ");
		int val2 = entrada.nextInt();
		
		maiorValor(val1, val2);
		System.out.println(maiorValorV2(val1, val2));
		System.out.println(maiorValorV3(val1, val2));
	}

	public static void maiorValor(int x, int y) {
		if (x > y) {
			System.out.println("Maior valor (1): " + x);
		} else if (x == y) {
			System.out.println("Valores são iguais!");
		} else {
			System.out.println("Maior valor (2): " + y);
		}
	}

	public static String maiorValorV2(int x, int y) {
		if (x > y) {
			return ("Maior valor (1): " + x);
		} else if (x == y) {
			return ("Valores são iguais!");
		} else {
			return ("Maior valor (2): " + y);
		}
	}
	
	public static String maiorValorV3(int x, int y) {
		String result;
		if (x > y) {
			result = "Maior valor (1): " + x;
		} else if (x == y) {
			result = "Valores são iguais!";
		} else {
			result = "Maior valor (2): " + y;
		}
		return result;
	}

}
