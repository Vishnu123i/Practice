package com.cartservice.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cartservice.model.Cart;
import com.cartservice.service.CartService;

@RestController
public class CartController {
	@Autowired
	CartService cartService;
	@PostMapping(path="/carts")
	public Cart createCart(@RequestBody @Valid Cart cart) {
		
		String dt1 = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		cart.setDate(dt1);
		return cartService.createCart(cart);
	}
	@PutMapping(path="/carts/update")
	public Cart updateCart(@RequestBody @Valid Cart cart) {
		return cartService.updateCart(cart);
	}

}
