package com.infstos.backend.zzzOld.Cart;

// package com.infstos.backend.Cart;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import com.infstos.backend.CustomProduct.CustomProduct;

// import java.util.Optional;

// @RestController
// @RequestMapping("/api/cart")
// public class CartController {

//     @Autowired
//     private CartService cartService;

//     @PostMapping("/add")
//     public Cart addProductToCart(@RequestParam String userId, @RequestBody CustomProduct product) {
//         return cartService.addProductToCart(userId, product);
//     }

//     @GetMapping("/{userId}")
//     public Optional<Cart> getCart(@PathVariable String userId) {
//         return cartService.getCartByUserId(userId);
//     }

//     @DeleteMapping("/{userId}/remove/{productId}")
//     public Cart removeProductFromCart(@PathVariable String userId, @PathVariable String productId) {
//         return cartService.removeProductFromCart(userId, productId);
//     }
// }
