// package com.infstos.backend.Old.CustomProduct;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class CustomProductService {

//     @Autowired
//     private CustomProductRepository customProductRepository;

//     public CustomProduct addCustomProduct(CustomProduct product) {
//         return customProductRepository.save(product);
//     }

//     public List<CustomProduct> getCustomProductsByUserID(String userID) {
//         return customProductRepository.findByUserID(userID);
//     }

//     public Optional<CustomProduct> getCustomProductById(String id) {
//         return customProductRepository.findById(id);
//     }
// }

