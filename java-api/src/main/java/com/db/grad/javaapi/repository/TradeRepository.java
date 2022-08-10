package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.db.grad.javaapi.model.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    // @Query(value = "select * from Trade where securityid = :securityid",
    // nativeQuery = true)
    public List<Trade> findBySecurityid(int securityid);// @Param("securityid") String securityid);

}