package com.cartservice.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cartservice.model.Cart;
import com.cartservice.repository.CartRepository;
@Repository
@Transactional
public class CartDao {
	@Autowired
	CartRepository cartRepository;

	public Cart saveCart(Cart cart) {
		return cartRepository.save(cart);
	}

	public Cart updateCart(Cart cart) {
		
		return cartRepository.save(cart);
	}

}
