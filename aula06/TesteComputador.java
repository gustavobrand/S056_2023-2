package aula06;

public class TesteComputador {

	public static void main(String[] args) {
		Computador c1 = new Computador("Meu Desktop", 1600);
		System.out.println("Nome : " + c1.getNome());
		System.out.println("Clock: " + c1.getClock());
		
		Computador c2 = new Computador();
		c2.setNome("Meu notebook");
		c2.setClock(1500);
		System.out.println("Nome : " + c2.getNome());
		System.out.println("Clock: " + c2.getClock());
		
		
		

	}

}
