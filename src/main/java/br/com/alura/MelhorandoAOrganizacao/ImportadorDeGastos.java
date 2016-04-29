package br.com.alura.MelhorandoAOrganizacao;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.alura.GerandoConteudoEficientemente.Gasto;
import br.com.alura.MenosErrosMaisProdutividade.Funcionario;

public class ImportadorDeGastos {

	private SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");

	public List<Gasto> importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		List<Gasto> gastos = new ArrayList<Gasto>();

		while (leitor.hasNextLine()) {
			String line = leitor.nextLine();
			String tipoGasto = line.substring(0, 6);
			String dataGasto = line.substring(6, 14);
			String valorGasto = line.substring(14, 23);
			String matricul = line.substring(23, 26);
			String nome = line.substring(26, 56);
			String dataNascTxt = line.substring(56);

			double valor = Double.parseDouble(valorGasto);
			int matricula = Integer.parseInt(matricul);
			Calendar dataNascimento = converteDataTxtParaCalendar(dataNascTxt);
			Calendar dataDespesa = converteDataTxtParaCalendar(dataGasto);

			Funcionario funcionario = new Funcionario(nome, matricula, dataNascimento);
			gastos.add(new Gasto(valor, tipoGasto, funcionario, dataDespesa));
		}
		return gastos;
	}

	private Calendar converteDataTxtParaCalendar(String dataNascTxt) throws ParseException {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(df.parse(dataNascTxt));
		return dataNascimento;
	}
}
