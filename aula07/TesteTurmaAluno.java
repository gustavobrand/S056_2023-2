package aula07;

public class TesteTurmaAluno {

	public static void main(String[] args) {
		// Exemplo 1
		Aluno a1;
		a1 = new Aluno("João", 7);
		Aluno a2;
		a2 = new Aluno("Maria", 8);
		Turma t1 = new Turma("S056", a1, a2);
		
		System.out.println(t1);
		System.out.println(t1.getAluno1());
		System.out.println(t1.getAluno2());
		
		System.out.println(a1 == t1.getAluno1());
		a1 = new Aluno("Jose", 9);
		System.out.println(a1 == t1.getAluno1());
		
	}

}
