package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.grad.javaapi.model.Counter_Party;

@Repository
public interface Counter_PartyRepository extends JpaRepository<Counter_Party, Long>{

}