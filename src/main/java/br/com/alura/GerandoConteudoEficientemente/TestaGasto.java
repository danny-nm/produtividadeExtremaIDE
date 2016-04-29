package br.com.alura.GerandoConteudoEficientemente;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.alura.MenosErrosMaisProdutividade.Funcionario;

public class TestaGasto {
	
	public static void main(String[] args) {
		
		Calendar dataNascimento = new GregorianCalendar(1995, 7, 7);
		Funcionario funcionario = new Funcionario("Daniella", 56789, dataNascimento);
		
		Calendar hoje = Calendar.getInstance();
		Gasto gasto1 = new Gasto(2000, "salário", funcionario, hoje);
		Gasto gasto2 = new Gasto(150, "vale transporte", funcionario, hoje);
		Gasto gasto3 = new Gasto(400, "vale refeição", funcionario, hoje);
		
		System.out.println(gasto1);
		System.out.println(gasto2);
		System.out.println(gasto3);
	}
}
	