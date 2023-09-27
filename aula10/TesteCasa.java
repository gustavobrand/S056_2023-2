package aula10;

public class TesteCasa {

	public static void main(String[] args) {
		Casa c1 = new Casa(100f);
		c1.AdicionarJanela(new Janela(2));
		c1.AdicionarJanela(new Janela(3));
		c1.AdicionarJanela(new Janela(5));
		c1.AdicionarPorta(new Porta("branca", 3));
		c1.AdicionarPorta(new Porta("cinza", 5));
		c1.AdicionarPorta(new Porta("marrom", 4));
		
		System.out.println(c1);
		
		System.out.println("Tamanho da casa: " + c1.getTamanhoEmMetros());
		c1.ListarJanelas_();
		c1.ListarPortas_();
	}

}
