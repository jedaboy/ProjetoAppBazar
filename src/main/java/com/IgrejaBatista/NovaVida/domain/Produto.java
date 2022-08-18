package com.IgrejaBatista.NovaVida.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double price;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "Categoria_id")
	private Categoria category;
	
	public Produto() {
		
	}
	
	public Produto(Integer id, String name, Double price, Categoria category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public Integer getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
    }
	public Categoria getCategory() {
		return category;
	}
	public void setCategory(Categoria category) {
		this.category = category;
	}

}
