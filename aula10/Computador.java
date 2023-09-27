package aula10;

import java.util.ArrayList;

public class Computador {
	private String nome;
	private float preco;
	private Processador cpu;
	private ArrayList<Disco> discos;
	
	public Computador(String nome, float preco, Processador cpu, 
			ArrayList<Disco> discos) {
		this.nome = nome;
		this.preco = preco;
		this.cpu = cpu;
		this.discos = discos;
	}
	public Computador(String nome, float preco, Processador cpu) {
		this.nome = nome;
		this.preco = preco;
		this.cpu = cpu;
		this.discos = new ArrayList<Disco>();
	}
	public void AdicionarDisco(Disco d) {
		this.discos.add(d);
	}
	public void ListarDiscos() {
		for (Disco d : this.discos) {
			System.out.println(d);
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Processador getCpu() {
		return cpu;
	}
	public void setCpu(Processador cpu) {
		this.cpu = cpu;
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}
	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}

	@Override
	public String toString() {
		return "Computador [nome=" + nome + ", preco=" + preco + ", cpu=" + cpu + ", discos=" + discos + "]";
	}
	
}
