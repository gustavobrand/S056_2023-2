package aula10;

public class TesteComputador {

	public static void main(String[] args) {
		Processador p1 = new Processador(900f, "Intel");
		Computador c1 = new Computador("Notebook trabalho", 3500f, p1);
		c1.AdicionarDisco(new Disco(500f, "SSD"));
		
		Disco d1 = new Disco(2000f, "HDD");
		c1.AdicionarDisco(d1);
		
		c1.ListarDiscos();
		System.out.println(c1);
		c1.getCpu().statusProcessador();
		
	}
	
}
