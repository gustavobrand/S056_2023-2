package aula16.FuncionarioAbstrato;

public class Diretor extends Funcionario {
	
	public Diretor(String nome, float salario) {
		super(nome, salario);
	}

	@Override
	public float calcularSalario() {
		float adicional = salario * 20/100;
		return salario + adicional;
	}

}
