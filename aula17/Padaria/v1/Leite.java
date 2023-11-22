package aula17.Padaria.v1;

import aula17.Padaria.v1.Tipos.TipoDeClassificacaoLeite;
import aula17.Padaria.v1.Tipos.TipoDeLeite;

public class Leite extends Produto {
	private Tipos.TipoDeLeite tipo;
	private Tipos.TipoDeClassificacaoLeite classificacao;
	
	public Leite(String nome, float preco, String marca, 
			TipoDeLeite tipo, TipoDeClassificacaoLeite classificacao) {
		super(nome, preco, marca);
		this.tipo = tipo;
		this.classificacao = classificacao;
	}

	@Override
	public void descricao() {
		System.out.println("Leite: " + tipo + ", classificação: " + classificacao);
		System.out.println(" Nome: " + nome + ", marca: " + marca + 
							", preço unit: R$" + precoUnidade);
	}

	@Override
	public String toString() {
		return "Leite [tipo=" + tipo + ", classificacao=" + classificacao + ", nome=" + nome + ", precoUnidade="
				+ precoUnidade + ", marca=" + marca + "]";
	}
	
	// TODO: gets/sets/toString
	
}
