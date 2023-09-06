package aula07;

public class ativ05T1_notaAluno {
	private String nomeAluno;
	private float nota1, nota2;
	
	public ativ05T1_notaAluno() {}
	
	public ativ05T1_notaAluno(String nomeAluno, 
			float nota1, float nota2) {
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String mostraNomeAluno() {
		return nomeAluno;
	}
	public void statusAluno() {
		if (mediaDoAluno() >= 7.0f) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}		
	}
	public float mediaDoAluno() {
//		float result = (nota1+nota2)/2;
//		return result;
		return (nota1+nota2)/2;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
}
