package br.com.alura.MaisFlexibilidadeAoGerarConteudo;

import javax.persistence.EntityManager;

public class JPAUtil {

	EntityManager em;
	
	EntityManager getEntityManager(){
		return em;
	}
	
	
}
