package br.com.alura.MaisFlexibilidadeAoGerarConteudo;

import java.util.List;

import br.com.alura.GerandoConteudoEficientemente.Gasto;

public class GastoDAO {

	private DAO<Gasto> dao;

	public void adiciona(Gasto entity) {
		dao.adiciona(entity);
	}

	public void remove(Gasto entity) {
		dao.remove(entity);
	}

	public Gasto buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Gasto> buscaTodos() {
		return dao.buscaTodos();
	}



}