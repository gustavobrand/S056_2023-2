package aula02;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("valor 1: ");
		int val1 = entrada.nextInt();
		System.out.print("valor 2: ");
		int val2 = entrada.nextInt();
		
//		if (val1 > val2) {
//			System.out.println("Maior valor (1): " + val1);
//		} else {
//			System.out.println("Maior valor (2): " + val2);
//		}
		
		if (val1 > val2) {
			System.out.println("Maior valor (1): " + val1);
		} else if (val1 == val2) {
			System.out.println("Valores são iguais!");
		} else {
			System.out.println("Maior valor (2): " + val2);
		}
	}

}
