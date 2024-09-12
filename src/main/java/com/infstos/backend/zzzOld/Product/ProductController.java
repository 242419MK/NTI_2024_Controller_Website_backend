package com.infstos.backend.zzzOld.Product;
// package com.infstos.backend.Old.Product;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/api/products")
// public class ProductController {

//     @Autowired
//     private ProductRepository productRepository;

//     // 1. GET /api/products - Lista produktów
//     @GetMapping
//     public List<Product> getAllProducts() {
//         return productRepository.findAll();
//     }

//     // 2. GET /api/products/{id} - Szczegóły produktu
//     @GetMapping("/{id}")
//     public ResponseEntity<Product> getProductById(@PathVariable String id) {
//         Optional<Product> product = productRepository.findById(id);
//         if (product.isPresent()) {
//             return ResponseEntity.ok(product.get());
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//     // 3. POST /api/products - Dodawanie produktu
//     @PostMapping
//     public Product createProduct(@RequestBody Product product) {
//         return productRepository.save(product);
//     }

//     // 4. PUT /api/products/{id} - Aktualizowanie produktu
//     @PutMapping("/{id}")
//     public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Product updatedProduct) {
//         Optional<Product> productOptional = productRepository.findById(id);
//         if (productOptional.isPresent()) {
//             Product product = productOptional.get();
//             product.setName(updatedProduct.getName());
//             product.setBaseprice(updatedProduct.getBaseprice());
//             product.setCable(updatedProduct.isCable());
//             product.setColor(updatedProduct.getColor());
//             product.setVariant(updatedProduct.getVariant());
//             //product.setImageURL(updatedProduct.getImageURL());
            
//             productRepository.save(product);
//             return ResponseEntity.ok(product);
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//     // 5. DELETE /api/products/{id} - Usuwanie produktu
//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
//         Optional<Product> product = productRepository.findById(id);
//         if (product.isPresent()) {
//             productRepository.deleteById(id);
//             return ResponseEntity.noContent().build();
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }
// }