package aula06;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Ma�a", 3.5f);
//		System.out.printf("Nome: %s, Pre�o: %f, Desc.: %s\n",
//				p1.getNome(), p1.getPreco(), p1.getDescricao());
//		
		Produto p2 = new Produto("Ma�a", 10f, "Ma�a Gala");
//		System.out.printf("Nome: %s, Pre�o: %f, Desc.: %s\n",
//				p2.getNome(), p2.getPreco(), p2.getDescricao());
		
		System.out.println(p1.toString());
		System.out.println(p2);

		//int, float, double, char
		if (p1 == p2) {
			System.out.println("Objetos estao no mesmo endere�o...");
		} else {
			System.out.println("Objetos estao em endere�os diferentes...");
		} 

		if (p1.equals(p2)) {
			System.out.println("Objetos s�o iguais...");
		} else {
			System.out.println("Objetos s�o diferentes...");
		} 

	}

}
