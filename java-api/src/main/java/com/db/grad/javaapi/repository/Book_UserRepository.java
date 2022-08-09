package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.grad.javaapi.model.Book_User;

@Repository
public interface Book_UserRepository extends JpaRepository<Book_User, Long>{

}