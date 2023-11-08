package aula16.FuncionarioAbstrato;

public abstract class Funcionario {
	protected String nome;
	protected float salario;
	
	public abstract float calcularSalario();

	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
}
