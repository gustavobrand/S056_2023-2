package aula10;

public class Processador {
	private float clock;
	private String marca;
	
	public Processador(float clock, String marca) {
		this.clock = clock;
		this.marca = marca;
	}

	public float getClock() {
		return clock;
	}
	public void setClock(float clock) {
		this.clock = clock;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void statusProcessador() {
		if (clock > 1000) {
			System.out.println("Computador rápido");
		} else {
			System.out.println("Computador lento");
		}
	}

	@Override
	public String toString() {
		return "Processador [clock=" + clock + ", marca=" + marca + "]";
	}
	
}
