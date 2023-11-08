package aula16.ativ04t2;

import aula16.ativ04t2.Tipos.QuantControles;
import aula16.ativ04t2.Tipos.TipoRadio;
import aula16.ativ04t2.Tipos.TipoTelevisao;

public class TesteProduto {

	public static void main(String[] args) {
		Tv minhatelevisao = new Tv("Tv da sala", 2000f, "LG", 40, 
				TipoTelevisao.QLED);
		Radio meuradinho = new Radio("Radinho de pilha", 50f, "Philips", 
				5, TipoRadio.PORTATIL);
		Videogame meuvideogame = new Videogame("Xbox", 1500f, "Microsoft", 
				QuantControles.DOIS);
		System.out.println(minhatelevisao);
		System.out.println(meuradinho);
		System.out.println(meuvideogame);
	}
}
