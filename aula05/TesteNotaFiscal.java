package aula05;

public class TesteNotaFiscal {

	public static void main(String[] args) {
		NotaFiscal nf1 = new NotaFiscal();
		nf1.nomeItem1 = "Maça";
		nf1.nomeItem2 = "Laranja";
		nf1.precoItem1 = 4.0f;
		nf1.precoItem2 = 3.0f;

		NotaFiscal nf2 = new NotaFiscal();
		nf2.nomeItem1 = "Camiseta";
		nf2.nomeItem2 = "Calça";
		nf2.precoItem1 = 50.0f;
		nf2.precoItem2 = 100f;
		
		NotaFiscal nf3 = new NotaFiscal();
		nf3.nomeItem1 = "Teclado";
		nf3.nomeItem2 = "Mouse";
		nf3.precoItem1 = 40f;
		nf3.precoItem2 = 20f;
		
		System.out.println("Preço médio da compra de " + 
				nf1.mostraNomeItem1() + " e " + nf1.mostraNomeItem2() +
				": R$" + nf1.calculaNotaFiscal());
		
		System.out.println("[nf2] Item 1: " + nf2.mostraNomeItem1());
		System.out.println("[nf2] Item 2: " + nf2.mostraNomeItem2());
		System.out.println("[nf2] Media: R$" + nf2.calculaNotaFiscal());
		
		System.out.printf("Preço médio da compra de %s e %s: R$ %f\n",
			nf3.mostraNomeItem1(),
			nf3.mostraNomeItem2(),
			nf3.calculaNotaFiscal());


	}

}





