package aula04;

public class Calculadora {
	int valor;
	String operacao;
	
	int somar(int a, int b) {
		int result = a+b;
		valor = result;
		operacao = "soma";
		return result;
	}
	int subtrair(int a, int b) {
		int result = a-b;
		valor = result;
		operacao = "subtração";
		return result;
	}
	int ultimoResultado() {
		return valor;
	}
	String ultimaOperacao() {
		return operacao;
	}
	
}
