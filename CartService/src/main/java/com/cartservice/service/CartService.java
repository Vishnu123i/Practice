package com.cartservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartservice.dao.CartDao;
import com.cartservice.model.Cart;
@Service
public class CartService {
	@Autowired
	CartDao cartDao;

	public Cart createCart(Cart cart) {

		return cartDao.saveCart(cart);
	}

	public Cart updateCart(Cart cart) {

		return cartDao.updateCart(cart);
	}
	

}
