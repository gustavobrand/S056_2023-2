package aula17.Padaria.v1;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<ItenNoCarrinho> items;

	public CarrinhoDeCompras() {
		this.items = new ArrayList<ItenNoCarrinho>();
	}
	
	public void AdicionarItem(ItenNoCarrinho i) {
		items.add(i);
		
		// Exemplo de foreach a ser usado no totaldacompra e listarprodutos
//		for (ItenNoCarrinho item : items) {
//			//item.getSubtotal() da acesso ao subtotal
//		}
	}
	
	// TODO: totaldacompra, listarprodutos, etc...
	
}
