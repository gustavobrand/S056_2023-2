package aula05;

public class NotaFiscal {
	String nomeItem1;
	String nomeItem2;
	float precoItem1;
	float precoItem2;

	float calculaNotaFiscal() {
		float result = (precoItem1 + precoItem2)/2;
		return result;
//		return (precoItem1 + precoItem2)/2;
	}
	String mostraNomeItem1() {
		return nomeItem1;
	}
	String mostraNomeItem2() {
		return nomeItem2;
	}
}
