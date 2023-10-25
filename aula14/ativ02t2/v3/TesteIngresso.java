package aula14.ativ02t2.v3;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(10f);
		IngressoBackstage ingBackstage = new IngressoBackstage();
		IngressoPista ingPista = new IngressoPista();
		IngressoVip ingVip = new IngressoVip();

		System.out.println(ingresso.getDescricao());
		System.out.println(ingBackstage.getDescricao());
		System.out.println(ingPista.getDescricao());
		System.out.println(ingVip.getDescricao());
	}

}
