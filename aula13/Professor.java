package aula13;

public class Professor extends Pessoa {

	public Professor(String nome, float salario) {
		super(nome, salario);
	}
	
	public float getSalario() {
		float adicional = salario * 15/100;
		return salario + adicional;
	}
	
}
