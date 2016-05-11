package br.com.alura.TestandoEDebugandoSuaAplicacao;

public class Fibonacci {

	public int calcula(int n) {

		int n1 = 0;
		int n2 = 1;

		for (int i = 1; i < n; i++) {
			n2 = n2 + n1;
			n1 = n2 - n1;
		}

		return n2;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {

			System.out.println("fib(" + i + ")=" + new Fibonacci().calcula(5));
		}
	}

}

//Descobrir com o debug, qual o valor de n1 e n2 se fibonacci é 5.

