package com.joao.tarefa.tp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALIMENTO")
public class Alimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String nome;
	
	@Column(name = "price")
	private Double price;
	
	@ManyToOne
	private Marca marca;
	
	@ManyToOne
	private Ingrediente ingrediente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	@Override
	public String toString() {
		return  "\n" + "Alimento: " + this.nome + "\n" + "Marca: " + this.marca.getNome() + "\n" + "Ingrediente Principal: " + this.ingrediente.getNome();
	}
	
	

}
