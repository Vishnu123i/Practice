package com.cartservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Min;

@Entity
@Table(name = "tbl_cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Min(value = 1, message = "userid must be not null")
	int userId;
	String date;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	@Valid
	List<Products> products;

	public Cart(int id, int userId, String date, List<Products> products) {
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.products = products;
	}

	public Cart() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

}
