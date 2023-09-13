package aula08;

import java.util.ArrayList;

public class Mae2 {
	private String nomeMae;
	private ArrayList<Filho> filhos;

	public Mae2(String nomeMae) {
		this.nomeMae = nomeMae;
		this.filhos = new ArrayList<Filho>();
	}
	public Mae2(String nomeMae, ArrayList<Filho> filhos) {
		this.nomeMae = nomeMae;
		this.filhos = filhos;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public ArrayList<Filho> getFilhos() {
		return filhos;
	}
	public void setFilhos(ArrayList<Filho> filhos) {
		this.filhos = filhos;
	}
	
	public void adicionarFilho(Filho f) {
		filhos.add(f);
	}
	
	@Override
	public String toString() {
		return "Mae2 [nomeMae=" + nomeMae + ", filhos=" + filhos + "]";
	}
	
	
	
	
}
