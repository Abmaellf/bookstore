package com.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.models.ReviewModel;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewModel, UUID>{
    
}
