package aula17.Padaria.v1;

public class ItenNoCarrinho {
	private int quantidade;
	private Produto item;
	private float subtotal;
	 
	public ItenNoCarrinho(int quantidade, Produto item, float subtotal) {
		this.quantidade = quantidade;
		this.item = item;
		this.subtotal = subtotal;
	}

	public float getSubtotal() {
		return subtotal;
	}
	 
	
	// TODO: gets/sets/toString... etc 
}
