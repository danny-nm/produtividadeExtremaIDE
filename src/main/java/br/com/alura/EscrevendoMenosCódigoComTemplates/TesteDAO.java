package br.com.alura.EscrevendoMenosC�digoComTemplates;

import java.util.List;

import br.com.alura.GerandoConteudoEficientemente.Gasto;
import br.com.alura.MaisFlexibilidadeAoGerarConteudo.GastoDAO;

public class TesteDAO {

	public static void main(String[] args) {

		GastoDAO dao = new GastoDAO();
		List<Gasto> todos = dao.buscaTodos();

		//Podemos cham�-lo atrav�s do template criado: forprint
		
		for (Gasto gasto : todos) {
			System.out.println(gasto);
		}
	}

}
