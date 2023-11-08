package aula16.FuncionarioAbstrato;

public class TesteFuncionarioAbstrato {

	public static void main(String[] args) {
		Diretor func1 = new Diretor("Maria", 1000f);
		Professor func2 = new Professor("Joao", 1000f);
		System.out.println("Salario Diretor: " + func1.calcularSalario());
		System.out.println("Salario Prof: " + func2.calcularSalario());
		
		// Isso nao é mais possivel pois a classe 
		// Funcionario é abstrata agora
		// Funcionario func3 = new Funcionario("Joao", 1000f);
	}

}
