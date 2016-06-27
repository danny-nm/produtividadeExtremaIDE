package br.com.alura.TestandoEDebugandoSuaAplicacao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import br.com.alura.GerandoConteudoEficientemente.Gasto;
import br.com.alura.MenosErrosMaisProdutividade.Funcionario;

public class FiltradorDeGastosTest {

	@Test
	public void soDevolveGastosComValorMaiorQueOLimite() {
		Funcionario funcionario = new Funcionario("Felipe", 123, new GregorianCalendar(1989, 3, 17));
		Calendar hoje = Calendar.getInstance();

		Gasto g1 = new Gasto(160.0, "Albúm", funcionario, hoje);
		Gasto g2 = new Gasto(800.0, "Cartão", funcionario, hoje);
		Gasto g3 = new Gasto(500.0, "Pessoas", funcionario, hoje);

		List<Gasto> lista = Arrays.asList(g1, g2, g3);

		FiltradorDeGastosEspeciais filtrador = new FiltradorDeGastosEspeciais(25.0);
		List<Gasto> gastosGrandes = filtrador.filtraGastosGrandes(lista);

		assertEquals(3, gastosGrandes.size());
		assertEquals(150.0, gastosGrandes.get(0).getValor(), 0.00001);

	}

}
