package ca.sheridan.sc.service;

import ca.sheridan.sc.model.Cart;
import ca.sheridan.sc.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    public Cart getCart() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Iphone");
        product.setPrice(2000D);

        Cart cart = new Cart();
        cart.setId(1L);
        cart.setProducts(List.of(product));
        return cart;
    }

}
