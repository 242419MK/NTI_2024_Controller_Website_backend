package com.infstos.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "comments")
public class Comment {

    @Id
    private String id;

    private String userId;    // Referencja do użytkownika
    private String productId; // Referencja do produktu
    private String text;      // Treść komentarza
    private Integer rating;   // Opcjonalna ocena
    private LocalDateTime createdDate; // Data utworzenia komentarza

    // Konstruktor
    public Comment(String userId, String productId, String text, Integer rating) {
        this.userId = userId;
        this.productId = productId;
        this.text = text;
        this.rating = rating;
        this.createdDate = LocalDateTime.now(); // Ustawienie bieżącej daty i godziny
    }

    // Getters and Setters
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
