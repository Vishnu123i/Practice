package com.cartservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name="tbl_product")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	@Min(value = 1,message = "quantity must be minimum of 1 ")
	int quantity;
	public Products(int productId,int quantity){
		this.productId=productId;
		this.quantity=quantity;
	}
	public Products() {
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
