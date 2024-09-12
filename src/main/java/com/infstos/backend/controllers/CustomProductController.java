package com.infstos.backend.controllers;
// package com.infstos.backend.Old.CustomProduct;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/custom")
// public class CustomProductController {

//     @Autowired
//     private CustomProductService customProductService;

//     // Endpoint do tworzenia nowego customowego produktu
//     @PostMapping("/products")
//     public ResponseEntity<CustomProduct> createCustomProduct(@RequestBody CustomProduct customProduct) {
//         CustomProduct savedProduct = customProductService.addCustomProduct(customProduct);
//         return ResponseEntity.ok(savedProduct);
//     }

//     // Endpoint do pobierania produktów danego użytkownika
//     @GetMapping("/products/{userId}")
//     public ResponseEntity<List<CustomProduct>> getCustomProductsByUserID(@PathVariable String userId) {
//         List<CustomProduct> products = customProductService.getCustomProductsByUserID(userId);
//         return ResponseEntity.ok(products);
//     }
// }
