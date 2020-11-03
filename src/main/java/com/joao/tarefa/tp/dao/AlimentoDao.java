package com.joao.tarefa.tp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.joao.tarefa.tp.model.Alimento;

public class AlimentoDao {

	@SuppressWarnings("unchecked")
	public List<Alimento> getAlimentos() throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		String sql = "select * from alimento order by name";
		Query query = em.createNativeQuery(sql, Alimento.class);
		return query.getResultList();
		
	}
	
	public Alimento FindById(int id) throws Exception {
		EntityManager em = JpaUtil.getEntityManager();
		Alimento al = em.find(Alimento.class, id);
		return al;
	}
	
	public void Delete(int id) throws Exception {
		EntityManager em = JpaUtil.getEntityManager();
		
		Alimento al = em.find(Alimento.class, id);
		em.getTransaction().begin();
		em.remove(al);
		em.getTransaction().commit();
		
	}
	
	public void Update(Alimento alimento) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(alimento);
		em.getTransaction().commit();
		
	}
	
	public void Cadastrar(Alimento alimento) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(alimento);
		em.getTransaction().commit();
	}
	
	
}
