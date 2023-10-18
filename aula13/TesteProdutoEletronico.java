package aula13;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		TV tv = new TV("Tv da sala de estar", 1000f, "LG", 40, "LCD");
		Radio radio = new Radio("Radinho de pilha", 50, "JBL", 5);
		Videogame videogame = new Videogame("Xbox S", 4000, "Microsoft", 2);
		
		System.out.println(tv);
		System.out.println(radio);
		System.out.println(videogame);

	}

}
