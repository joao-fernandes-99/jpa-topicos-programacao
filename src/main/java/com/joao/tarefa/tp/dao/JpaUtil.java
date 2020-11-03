package com.joao.tarefa.tp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emf;

	public static EntityManager getEntityManager() throws Exception {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("configuracaodados");
		}
		return emf.createEntityManager();
	}
	
	
}
