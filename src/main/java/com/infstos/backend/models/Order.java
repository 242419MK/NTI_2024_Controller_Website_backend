// package com.infstos.backend.models;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;

// import java.util.List;

// @Document(collection = "orders")
// public class Order {
    
//     @Id
//     private String id;

//     private String userId;
//     private List<CustomProduct> products;
//     private double totalPrice;
//     private String shippingAddress;

//     // Getters and setters

//     public String getId() {
//         return id;
//     }

//     public void setId(String id) {
//         this.id = id;
//     }

//     public String getUserId() {
//         return userId;
//     }

//     public void setUserId(String userId) {
//         this.userId = userId;
//     }

//     public List<CustomProduct> getProducts() {
//         return products;
//     }

//     public void setProducts(List<CustomProduct> products) {
//         this.products = products;
//     }

//     public double getTotalPrice() {
//         return totalPrice;
//     }

//     public void setTotalPrice(double totalPrice) {
//         this.totalPrice = totalPrice;
//     }

//     public String getShippingAddress() {
//         return shippingAddress;
//     }

//     public void setShippingAddress(String shippingAddress) {
//         this.shippingAddress = shippingAddress;
//     }
// }
