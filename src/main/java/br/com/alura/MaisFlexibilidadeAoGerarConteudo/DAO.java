package br.com.alura.MaisFlexibilidadeAoGerarConteudo;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;

public class DAO <T> { //tipo genérico T

	private final EntityManager entityManager = new JPAUtil().getEntityManager();
	private Class<T> classe;
	
	public DAO(Class<T> classe) {
		super();
		this.classe = classe;
	}

	public void adiciona(T entity) {
	    entityManager.persist(entity);
	}

	public T atualiza(T entity) {
	    return entityManager.merge(entity);
	}

	public void remove(T entity) {
	    entityManager.remove(entity);
	}

	public T buscaPorId(Long id) {
	    return entityManager.find(classe, id);
	}

	public List<T> buscaTodos() {
	    javax.persistence.Query query = entityManager
	            .createQuery("from " + classe.getName());
	    return query.getResultList();
	}

}