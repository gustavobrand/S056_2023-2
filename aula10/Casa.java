package aula10;

import java.util.ArrayList;

public class Casa {
	private float tamanhoEmMetros;
	private ArrayList<Porta> portas;
	private ArrayList<Janela> janelas;
	   
	public Casa (float tamanhoEmMetros) {
		this.tamanhoEmMetros = tamanhoEmMetros;
		this.portas = new ArrayList<Porta>();
		this.janelas = new ArrayList<Janela>();
	}
	public void AdicionarPorta(Porta p) {
		this.portas.add(p);
	}
	public void AdicionarJanela(Janela j) {
		this.janelas.add(j);
	}
	public void ListarJanelas_() {
		for (Janela minhaQueridaJanela : this.janelas) {
			System.out.println(minhaQueridaJanela);
		}
	}
	public String ListarJanelas() {
		String janelas = "";
		for (Janela j : this.janelas) {
			janelas = janelas + j + "\n";
		}
		return janelas;
	}
	public void ListarPortas_() {
		for (Porta minhaQueridaPorta : this.portas) {
			System.out.println(minhaQueridaPorta);
		}
	}
	public String ListarPortas() {
		String portas = "";
		for (Porta p : this.portas) {
			portas += p + "\n";
		}
		return portas;
	}
	public float getTamanhoEmMetros() {
		return tamanhoEmMetros;
	}
	public void setTamanhoEmMetros(float tamanhoEmMetros) {
		this.tamanhoEmMetros = tamanhoEmMetros;
	}
	@Override
	public String toString() {
		return "TamanhoEmMetros: " + tamanhoEmMetros + "m2" +
				"\nPortas: " + ListarPortas() + 
				"Janelas: " + ListarJanelas();
	}
	   
}





