package aula12;

public class TesteVeiculo {

	public static void main(String[] args) {
		Moto m1 = new Moto("AAA3322", "150", "Yamaha", 2010, "vermelho",
				"Joao", 10, "disco", 150, "Street", "eletrica", false);
		System.out.println(m1.getTipoPartida());
		System.out.println(m1.getPlaca());
		System.out.println(m1);
		
		Carro c1 = new Carro("ATZ3332", "Uno", "Fiat", 2000, "branco", 
				"Jose", 45, "disco", 4, "manual", "tecido", "manual", 75, 4, 200);
		System.out.println(c1.getPlaca());
		System.out.println(c1.getRevestBanco());
		System.out.println(c1);
		
		
		
	}

}
