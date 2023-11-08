package aula16.FuncionarioAbstrato;

public class Professor extends Funcionario {
	
	public Professor(String nome, float salario) {
		super(nome, salario);
	}

	@Override
	public float calcularSalario() {
		float adicional = salario * 15/100;
		return salario + adicional;
	}

}
