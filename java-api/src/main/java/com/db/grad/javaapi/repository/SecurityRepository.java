package com.db.grad.javaapi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.db.grad.javaapi.model.Security;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Integer> {
    @Query(value = "select * from Securities where securityid in (select distinct(securityid) from Trade where bookid in (select bookid from Book_User where userid = :userId))", nativeQuery = true)
    public List<Security> findSecurityByUserid(@Param("userId") String userId);

    // public List<Security>
    // findAllBymaturity_dateLessThanEqualAndmaturity_dateGreaterThanEqual(Date
    // endmaturity_date,
    // Date startmaturity_date);

}