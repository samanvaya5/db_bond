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
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;

import com.db.grad.javaapi.model.Users;
import com.db.grad.javaapi.repository.UsersRepository;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;

@RestController
@RequestMapping("/api/v1")
public class TradeController {
    @Autowired
    private TradeRepository TradeRepository;
    private UsersRepository UsersRepository;
    private SecurityRepository SecurityRepository;

    @GetMapping("/trade/{id}")
    public ResponseEntity<Trade> getTradeById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Trade trades = TradeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id :: " + id));
        return ResponseEntity.ok().body(trades);
    }

    @GetMapping("/trade")
    public List<Trade> getAllTrades() {
        return TradeRepository.findAll();
    }

    @GetMapping("/SecurityFromtrade/{id}")
    public ResponseEntity<Security> getSecurityFromtrade(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Trade trades = TradeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id :: " + id));

        int securityid = trades.getSecurityid();
        Security security = SecurityRepository.findById(securityid)
                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));
        return ResponseEntity.ok().body(security);
    }

    @PostMapping("/trade")
    public Trade createtrade(@Valid @RequestBody Trade trade) {
        // if(user.getRole() == "admin") {
        return TradeRepository.saveAndFlush(trade);
        // return "DONE!";
        // }
        // return "Not an ADMIN to perform this operation";

    }

    @PutMapping("/trade/{id}")
    public ResponseEntity<Trade> updateTrade(@PathVariable(value = "id") Long id,
            @Valid @RequestBody Trade tradeDetails) throws ResourceNotFoundException {

        // if(user.getRole() == "admin") {
        Trade getTrade = TradeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id :: " + id));

        getTrade.setQuantity(tradeDetails.getQuantity());
        getTrade.setStatus(tradeDetails.getStatus());
        getTrade.setBuy_sell(tradeDetails.getBuy_sell());
        getTrade.setPrice(tradeDetails.getPrice());
        getTrade.setTrade_date(tradeDetails.getTrade_date());
        getTrade.setSettlement_date(tradeDetails.getSettlement_date());
        final Trade updatedTrade = TradeRepository.save(getTrade);
        return ResponseEntity.ok(updatedTrade);
        // }

    }

    @GetMapping("/TradesForSecurity/{id}")
    public ResponseEntity<List<Trade>> getTradeById(@PathVariable(value = "id") int id)
            throws ResourceNotFoundException {
        System.out.println(id);
        List<Trade> trades = TradeRepository.findBySecurityid(id);
        return ResponseEntity.ok().body(trades);
    }

}
