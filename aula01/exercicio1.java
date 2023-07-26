package aula01;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
//		System.out.println("Nome: Gustavo");
//		System.out.println("End: Rua abc, 100");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = entrada.next();
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Nome: " + nome + ", idade: " + idade);
		
	}

}
