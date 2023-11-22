package aula17.Padaria.v1;

import aula17.Padaria.v1.Tipos.TipoDeClassificacaoLeite;
import aula17.Padaria.v1.Tipos.TipoDeLeite;

public class TesteProduto {

	public static void main(String[] args) {
		Leite l1 = new Leite("Leite teste", 5f, "Languiru", 
				TipoDeLeite.INTEGRAL, TipoDeClassificacaoLeite.C);
		l1.descricao();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		// Formato 1
		carrinho.AdicionarItem(new ItenNoCarrinho(10, 
				new Leite("Leite teste", 1.5f, "Ninho", 
					TipoDeLeite.INTEGRAL, TipoDeClassificacaoLeite.C)));
		
		// Formato 2
		Leite l2 = new Leite("Leite teste", 1.5f, "Ninho", 
				TipoDeLeite.INTEGRAL, TipoDeClassificacaoLeite.C);
		ItenNoCarrinho i1 = new ItenNoCarrinho(10, l2);
		carrinho.AdicionarItem(i1);
		
		carrinho.ListarProdutos();
	}

}
