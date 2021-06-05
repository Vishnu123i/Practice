package com.cartservice.controller;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cartservice.model.Cart;
import com.cartservice.model.Products;
import com.cartservice.service.CartService;

@ExtendWith(MockitoExtension.class)
public class CartControllerTest {
	@Mock
	CartService cartService;
	@InjectMocks
	CartController cartController;
	@Test
	void updateCartTest() {
		Products products1 = new Products(1, 2);
		Products products2 = new Products(2, 4);
		
		
		Cart cart = new Cart(1, 2,"2021-05-20", Arrays.asList(products1,products2));
		
		Mockito.when(cartService.updateCart(cart)).thenReturn(cart);
		
		Cart cartReturn = cartController.updateCart(cart);
		
		Assertions.assertEquals(2,cartReturn.getUserId());
	}
	
}
