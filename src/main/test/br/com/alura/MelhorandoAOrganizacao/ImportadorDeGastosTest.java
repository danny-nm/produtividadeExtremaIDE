package br.com.alura.MelhorandoAOrganizacao;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.Collection;

import org.junit.Test;

import br.com.alura.GerandoConteudoEficientemente.Gasto;

public class ImportadorDeGastosTest {

	@Test
	public void deveRetornarUmaListaVaziaSeOArquivoPassadoForVazio() throws ParseException {
		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);

		assertTrue("A lista não está vazia!", gastos.isEmpty());
	}
	
	@Test
	public void deveRetornarUmGastoDeUmArquivoNoFormatoCorreto() throws ParseException {
		String conteudo = "07071995";
		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);
		
		assertEquals("Deveria ter um elemento!",1, gastos.size());
	}
	
	

}
