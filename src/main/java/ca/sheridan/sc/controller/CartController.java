package ca.sheridan.sc.controller;

import ca.sheridan.sc.model.Cart;
import ca.sheridan.sc.model.Product;
import ca.sheridan.sc.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public Cart getCarts() {
        return cartService.getCart();
    }

}
