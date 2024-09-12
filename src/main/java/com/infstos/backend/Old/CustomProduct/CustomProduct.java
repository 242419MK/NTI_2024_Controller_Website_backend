// package com.infstos.backend.Old.CustomProduct;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "Custom_products")
// public class CustomProduct {

//     @Id
//     private String id;
//     private String userID;
//     private String buttonColor;
//     private String wholeColor;
//     private double basePrice;
//     private boolean isCable;
//     private String variant;  // Typ padów np. "xbox", "ps4"

//     // Gettery i Settery
//     public String getId() {
//         return id;
//     }

//     public void setId(String id) {
//         this.id = id;
//     }

//     public String getUserID() {
//         return userID;
//     }

//     public void setUserID(String userID) {
//         this.userID = userID;
//     }

//     public String getButtonColor() {
//         return buttonColor;
//     }

//     public void setButtonColor(String buttonColor) {
//         this.buttonColor = buttonColor;
//     }

//     public String getWholeColor() {
//         return wholeColor;
//     }

//     public void setWholeColor(String wholeColor) {
//         this.wholeColor = wholeColor;
//     }

//     public double getBasePrice() {
//         return basePrice;
//     }

//     public void setBasePrice(double basePrice) {
//         this.basePrice = basePrice;
//     }

//     public boolean isCable() {
//         return isCable;
//     }

//     public void setCable(boolean cable) {
//         isCable = cable;
//     }

//     public String getVariant() {
//         return variant;
//     }

//     public void setVariant(String variant) {
//         this.variant = variant;
//     }

// }
