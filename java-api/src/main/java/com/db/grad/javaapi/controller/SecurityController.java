package com.db.grad.javaapi.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;

import com.db.grad.javaapi.model.Users;
import com.db.grad.javaapi.repository.UsersRepository;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;

@RestController
@RequestMapping("/api/v1")
public class SecurityController {
    @Autowired

    private SecurityRepository SecurityRepository;
    private TradeRepository TradeRepository;

    @GetMapping("/security")
    public List<Security> getAllSecurities() {
        return SecurityRepository.findAll();
    }

    @GetMapping("/security/{id}")
    public ResponseEntity<Security> getSecurityById(@PathVariable(value = "id") int id)
            throws ResourceNotFoundException {
        Security security = SecurityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Secuirty not found for this id :: " + id));
        return ResponseEntity.ok().body(security);
    }

    @GetMapping("/securityByUser/{id}")
    public ResponseEntity<List<Security>> getSecurityByUserId(@PathVariable(value = "id") String id)
            throws ResourceNotFoundException {
        System.out.println(id);
        List<Security> securities = SecurityRepository.findSecurityByUserid(id);
        return ResponseEntity.ok().body(securities);
    }

    /*
     * @GetMapping("/securitesByDate")
     * public ResponseEntity<List<Security>> getSecuritiesByDateRange(
     * 
     * @RequestParam("endDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date
     * endDate,
     * 
     * @RequestParam("startDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date
     * startDate)
     * throws ResourceNotFoundException {
     * List<Security> securities = SecurityRepository
     * .findAllBymaturity_dateLessThanEqualAndmaturity_dateGreaterThanEqual(endDate,
     * startDate);
     * return ResponseEntity.ok().body(securities);
     * }
     */

    @PostMapping("/security")
    public Security createSecurity(@Valid @RequestBody Security security) {

        return SecurityRepository.saveAndFlush(security);
    }

    @DeleteMapping("/security")
    public void deleteSecurity(@PathVariable(value = "id") int id) {
        SecurityRepository.deleteById(id);
    }

}
