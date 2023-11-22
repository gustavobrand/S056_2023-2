package aula17.Padaria.v1;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<ItenNoCarrinho> items;

	public CarrinhoDeCompras() {
		this.items = new ArrayList<ItenNoCarrinho>();
	}
	
	public void AdicionarItem(ItenNoCarrinho i) {
		items.add(i);
	}
	public void ListarProdutos() {
		for (ItenNoCarrinho item : items) {
			System.out.println(item);
		}
	}
	
	// TODO: totaldacompra, listarprodutos, etc...
	
}
