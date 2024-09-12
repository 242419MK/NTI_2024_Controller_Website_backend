package com.infstos.backend.zzzOld.Cart;
// package com.infstos.backend.Cart;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.infstos.backend.CustomProduct.CustomProduct;

// import java.util.Optional;

// @Service
// public class CartService {
    
//     @Autowired
//     private CartRepository cartRepository;

//     public Cart addProductToCart(String userId, CustomProduct product) {
//         Optional<Cart> optionalCart = cartRepository.findByUserId(userId);
//         Cart cart;
        
//         if (optionalCart.isPresent()) {
//             cart = optionalCart.get();
//         } else {
//             cart = new Cart();
//             cart.setUserId(userId);
//         }

//         cart.getProducts().add(product);
//         return cartRepository.save(cart);
//     }

//     public Optional<Cart> getCartByUserId(String userId) {
//         return cartRepository.findByUserId(userId);
//     }

//     public Cart removeProductFromCart(String userId, String productId) {
//         Optional<Cart> optionalCart = cartRepository.findByUserId(userId);
        
//         if (optionalCart.isPresent()) {
//             Cart cart = optionalCart.get();
//             cart.getProducts().removeIf(product -> product.getId().equals(productId));
//             return cartRepository.save(cart);
//         }

//         return null; // handle if cart not found
//     }
// }
