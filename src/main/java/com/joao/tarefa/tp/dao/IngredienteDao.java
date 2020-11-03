package com.joao.tarefa.tp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.joao.tarefa.tp.model.Ingrediente;


public class IngredienteDao {

	public void Cadastrar(Ingrediente ingrediente) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(ingrediente);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Ingrediente> getIngredientes() throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		String sql = "select * from ingrediente order by name";
		Query query = em.createNativeQuery(sql, Ingrediente.class);
		return query.getResultList();
	}
	
	public Ingrediente FindById(int id) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		Ingrediente in = em.find(Ingrediente.class, id);
		return in;
		
	}
	
	public void Delete(int id) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		
		Ingrediente ingrediente = em.find(Ingrediente.class, id);
		em.getTransaction().begin();
		em.remove(ingrediente);
		em.getTransaction().commit();
		
	}
	
	public void Update(Ingrediente ingrediente) throws Exception {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(ingrediente);
		em.getTransaction().commit();
		
	}
	
	
}
