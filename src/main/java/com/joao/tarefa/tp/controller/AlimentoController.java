package com.joao.tarefa.tp.controller;

import java.util.List;

import com.joao.tarefa.tp.dao.AlimentoDao;
import com.joao.tarefa.tp.model.Alimento;

public class AlimentoController {
	
	
	public List<Alimento> findAllALimentos(){
		try {
			AlimentoDao dao = new AlimentoDao();
			return dao.getAlimentos();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Alimento findAlimento(int id) {
		try {
			AlimentoDao dao = new AlimentoDao();
			return dao.FindById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void Delete(int id) {
		try {
			AlimentoDao dao = new AlimentoDao();
			dao.Delete(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update(Alimento alimento) {
		try {
			AlimentoDao dao = new AlimentoDao();
			dao.Update(alimento);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cadastrarAlimento(Alimento alimento) {
		try {
			AlimentoDao dao = new AlimentoDao();
			dao.Cadastrar(alimento);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
