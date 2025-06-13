package com.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.models.AuthorModel;

@Repository
public interface AuthorRepository  extends JpaRepository<AuthorModel, UUID>{
    
}
