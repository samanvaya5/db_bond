package com.db.grad.javaapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Book_User;
import com.db.grad.javaapi.repository.Book_UserRepository;

@RestController
@RequestMapping("/api/v1/book_user")
public class Book_UserController {
  @Autowired
  private Book_UserRepository Book_UserRepository;

  @GetMapping("/book_user")
  public List < Book_User > getAllBook_User() {
      return Book_UserRepository.findAll();
  }
}
