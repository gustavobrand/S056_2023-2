package aula03;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("nota 1: ");
		float n1 = entrada.nextFloat();
		System.out.print("nota 2: ");
		float n2 = entrada.nextFloat();
		System.out.print("nota 3: ");
		float n3 = entrada.nextFloat();
		
		String statusAluno = situacaoDoAluno(n1, n2, n3);
		System.out.println("Aluno est� " + statusAluno);
	}
	
	public static String situacaoDoAluno(float n1, float n2, float n3) {
		float media = (n1+n2+n3)/3;
		String statusAluno;
		if (media >= 7.0) {
			statusAluno = "aprovado";
		} else if (media >= 5.0) {
			statusAluno = "em recupera��o";
		} else {
			statusAluno = "reprovado";
		}
		return statusAluno;
	}
}
