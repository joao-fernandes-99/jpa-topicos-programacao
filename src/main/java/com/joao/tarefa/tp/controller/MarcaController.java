package com.joao.tarefa.tp.controller;

import java.util.List;

import com.joao.tarefa.tp.dao.MarcaDao;
import com.joao.tarefa.tp.model.Marca;

public class MarcaController {

	
	public String cadastrarMarca(Marca marca) {
		try {
			MarcaDao dao = new MarcaDao();
			dao.Cadastrar(marca);
			return "Marca" + marca.getNome() + " cadastrada com sucesso";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "ERROR";
		}
		
	}
	
	public List<Marca> findAllMarcas(){
		try{
			MarcaDao dao = new MarcaDao();
			return dao.getMarcas();
		}
		catch (Exception e) {
			e.printStackTrace();
			List<Marca> marcasEmpy = null;
			return marcasEmpy;
			
		}
			
	}
	
	public Marca FindMarca(int id) {
		try {
			MarcaDao dao = new MarcaDao();
			return dao.FindById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void Update(Marca marca) {
		try {
			MarcaDao dao = new MarcaDao();
			dao.Update(marca);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Delete(int id) {
		try {
			MarcaDao dao = new MarcaDao();
			dao.Delete(id);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
	
	
}
