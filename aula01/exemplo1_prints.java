package aula01;

import java.util.Scanner;

public class exemplo1_prints {

	public static void main(String[] args) {

		System.out.print("Exemplo de print");
		
		System.out.println("Exemplo de println" + " com mais isso daqui" + "!");
		
		System.out.printf("Exemplo de printf\n");
		
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com uma string: ");
		String var3 = entrada.next();
		
		System.out.print("Entre com um numero: ");
		int var1 = entrada.nextInt();
		System.out.print("Entre com um numero: ");
		int var2 = entrada.nextInt();
		System.out.println(var1 + " e " + var2 + " e " + var3);
		int var4 = var1 + var2;
		System.out.println(var4);
		
		System.out.printf("%d e %d e %s\n", var1, var2, var3);bb
	}

}
