package aula13;

public class Diretor extends Pessoa {

	public Diretor(String nome, float salario) {
		super(nome, salario);
	}

	public float getSalario() {
		float adicional = salario * 20/100;
		return salario + adicional;
	}
}
