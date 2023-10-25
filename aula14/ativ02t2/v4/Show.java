package aula14.ativ02t2.v4;

import java.util.ArrayList;

public class Show {

	protected ArrayList<Ingresso> ingressos;
	
	public Show() {
		ingressos = new ArrayList<Ingresso>();
	}
	
	public boolean AdicionarIngresso(Ingresso i) {
		if (ingressos.size() >= 4) {
			return false;
		}
		ingressos.add(i);
		return true;
	}
	
	public void MostrarIngressos() {
		for (Ingresso temp : ingressos) {
			//System.out.println(temp);
			MostraIngresso(temp);
		}
	}
	
	private void MostraIngresso(Ingresso ing) {
		System.out.println(ing);
	}
}
