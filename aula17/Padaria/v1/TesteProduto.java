package aula17.Padaria.v1;

import aula17.Padaria.v1.Tipos.TipoDeClassificacaoLeite;
import aula17.Padaria.v1.Tipos.TipoDeLeite;

public class TesteProduto {

	public static void main(String[] args) {
		Leite l1 = new Leite("Leite teste", 5f, "Languiru", 
				TipoDeLeite.INTEGRAL, TipoDeClassificacaoLeite.C);
		l1.descricao();
	}

}
