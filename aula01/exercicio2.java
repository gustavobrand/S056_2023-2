package aula01;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Medida lado 1: ");
		float lado1 = entrada.nextFloat();
		System.out.print("Medida lado 2: ");
		float lado2 = entrada.nextFloat();
		
		float result = lado1*lado2;
		System.out.println("Resultado: " + result);
		
	}

}
