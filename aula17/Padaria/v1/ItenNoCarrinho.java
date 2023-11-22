package aula17.Padaria.v1;

public class ItenNoCarrinho {
	private int quantidade;
	private Produto item;
	private float subtotal;
	 
	public ItenNoCarrinho(int quantidade, Produto item) {
		this.quantidade = quantidade;
		this.item = item;
		this.subtotal = quantidade*item.getPrecoUnidade();
	}

	public float getSubtotal() {
		return subtotal;
	}

	@Override
	public String toString() {
		return "Qtde: " + quantidade + ", item:" + item + 
				", preço unit: R$" + item.getPrecoUnidade() + 
				", subtotal:" + subtotal;
	}
	
	
	
	// TODO: gets/sets/toString... etc 
}
