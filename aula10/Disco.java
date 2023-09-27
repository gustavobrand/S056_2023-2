package aula10;

public class Disco {
	private float capacidade;
	private String tipo; //SSD ou HD
	
	public Disco(float capacidade, String tipo) {
		this.capacidade = capacidade;
		this.tipo = tipo;
	}
	
	public float getCapacidade() { return capacidade; }
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Disco [capacidade=" + capacidade + ", tipo=" + tipo + "]";
	}
	
}
