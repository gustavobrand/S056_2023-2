package aula11;

public class TesteRelogio {

	public static void main(String[] args) {
		Relogio r = new Relogio();
		r.configuraHorario(10, 10, 10);
		System.out.println(r);
		r.configuraHorario(11, 11);
		System.out.println(r);

	}

}
