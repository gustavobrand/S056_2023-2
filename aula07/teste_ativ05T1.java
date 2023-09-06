package aula07;

public class teste_ativ05T1 {
	
	public static void main(String[] args) {
		ativ05T1_notaAluno aluno1 = new ativ05T1_notaAluno();
		ativ05T1_notaAluno aluno2 = new ativ05T1_notaAluno(
				"João", 4f, 7f);
		aluno1.setNomeAluno("Maria");
		aluno1.setNota1(7f);
		aluno1.setNota2(8f);
		
		System.out.print(aluno1.getNomeAluno() + ": ");
		aluno1.statusAluno();
//		aluno1.mediaDoAluno();
		
		System.out.print(aluno2.getNomeAluno() + ": ");
		aluno2.statusAluno();
	}
}
