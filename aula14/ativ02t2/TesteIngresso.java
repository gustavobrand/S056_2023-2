package aula14.ativ02t2;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(10f, "Ingresso sem classificação");
		IngressoBackstage ingBackstage = new IngressoBackstage();
		IngressoPista ingPista = new IngressoPista();
		IngressoVip ingVip = new IngressoVip();

		System.out.println(ingresso);
		System.out.println(ingBackstage);
		System.out.println(ingPista);
		System.out.println(ingVip);
	}

}
