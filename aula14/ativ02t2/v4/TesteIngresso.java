package aula14.ativ02t2.v4;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(10f, "Ingresso sem classificação");
		IngressoBackstage ingBackstage = new IngressoBackstage();
		IngressoPista ingPista = new IngressoPista();
		IngressoVip ingVip = new IngressoVip();

		Show showExemplo = new Show();
		showExemplo.AdicionarIngresso(ingresso);
		showExemplo.AdicionarIngresso(ingBackstage);
		showExemplo.AdicionarIngresso(ingPista);
		showExemplo.AdicionarIngresso(ingVip);
		showExemplo.AdicionarIngresso(ingresso);
		showExemplo.AdicionarIngresso(ingBackstage);
		showExemplo.AdicionarIngresso(ingPista);
		showExemplo.AdicionarIngresso(ingVip);
		showExemplo.MostrarIngressos();
		
	}

}
