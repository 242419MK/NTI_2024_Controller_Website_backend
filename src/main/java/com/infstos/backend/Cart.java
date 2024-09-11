package com.infstos.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "cart")
public class Cart {
    
    @Id
    private String id;
    
    private String userId;
    private List<CustomProduct> products;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CustomProduct> getProducts() {
        return products;
    }

    public void setProducts(List<CustomProduct> products) {
        this.products = products;
    }
}
