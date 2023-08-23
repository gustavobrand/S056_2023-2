package aula05;

public class TesteCarro {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.setNome("Fusca 1970");
		// fusca.nome = "Fusca 1970";
		fusca.setPotencia(1600);
		// fusca.potencia = 1600;
		System.out.println("Nome: " + fusca.getNome());
		System.out.println("Potencia: " + fusca.getPotencia());
	}

}
