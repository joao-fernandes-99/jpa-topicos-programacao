package com.joao.tarefa.tp.controller;

import java.util.List;

import com.joao.tarefa.tp.dao.IngredienteDao;
import com.joao.tarefa.tp.model.Ingrediente;

public class IngredienteController {
	
	
	public String cadastrarIngrediente(Ingrediente ingrediente) {
		try {
			IngredienteDao dao = new IngredienteDao();
			dao.Cadastrar(ingrediente);
			return "Ingrediente " + ingrediente.getNome() + " cadastrada com sucesso";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "ERROR";
		}
		
	}
	
	public List<Ingrediente> findAllIngredientes(){
		try{
			IngredienteDao dao = new IngredienteDao();
			return dao.getIngredientes();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}
			
	}
	
	public Ingrediente FindIngrediente(int id) {
		try {
			IngredienteDao dao = new IngredienteDao();
			return dao.FindById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void Update(Ingrediente ingrediente) {
		try {
			IngredienteDao dao = new IngredienteDao();
			dao.Update(ingrediente);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Delete(int id) {
		try {
			IngredienteDao dao = new IngredienteDao();
			dao.Delete(id);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	

}
