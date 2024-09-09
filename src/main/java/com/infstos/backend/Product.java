package com.infstos.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")

@jakarta.persistence.Entity
public class Product {
    
    @Id
    private String id;
    private String name;
    private double baseprice;
    private boolean isCable;
    private String size;
    private String color;
    private String variant;
    private String imageURL;

        // Gettery i settery
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getBaseprice() {
            return baseprice;
        }
    
        public void setBaseprice(double baseprice) {
            this.baseprice = baseprice;
        }
    
        public boolean isCable() {
            return isCable;
        }
    
        public void setCable(boolean cable) {
            this.isCable = cable;
        }
    
        public String getSize() {
            return size;
        }
    
        public void setSize(String size) {
            this.size = size;
        }
    
        public String getColor() {
            return color;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        public String getVariant() {
            return variant;
        }
    
        public void setVariant(String variant) {
            this.variant = variant;
        }
    
        public String getImageURL() {
            return imageURL;
        }
    
        public void setImageURL(String imageURL) {
            this.imageURL = imageURL;
        }
    }

