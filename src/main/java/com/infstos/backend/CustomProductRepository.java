package com.infstos.backend;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CustomProductRepository extends MongoRepository<CustomProduct, String> {
    List<CustomProduct> findByUserID(String userID);
}
