package br.com.alura.MenosErrosMaisProdutividade;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Principal {
	public static void main(String[] args) {

		Calendar dataNascimento = new GregorianCalendar(1995, 7, 7);
		Funcionario funcionario = new Funcionario("Daniella", 01234, dataNascimento);
		System.out.println(funcionario);
	}
}
