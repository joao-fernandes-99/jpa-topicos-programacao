package com.joao.tarefa.tp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.joao.tarefa.tp.model.Marca;

public class MarcaDao {
	
	public void Cadastrar(Marca marca) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(marca);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Marca> getMarcas() throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		String sql = "select * from marca order by name";
		Query query = em.createNativeQuery(sql, Marca.class);
		return query.getResultList();
	}
	
	public Marca FindById(int id) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		Marca m = em.find(Marca.class, id);
		return m;
		
	}
	
	public void Delete(int id) throws Exception{
		EntityManager em = JpaUtil.getEntityManager();
		
		Marca marca = em.find(Marca.class, id);
		em.getTransaction().begin();
		em.remove(marca);
		em.getTransaction().commit();
		
	}
	
	public void Update(Marca marca) throws Exception {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(marca);
		em.getTransaction().commit();
		
	}
	
	

}
