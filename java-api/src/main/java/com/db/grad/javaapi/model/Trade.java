package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Trade")
public class Trade implements Serializable {
    @Id
    private Long tradeid;
    private int bookid;
    private int counterpartyid;
    private int securityid;
    private int quantity;
    private String status, buy_sell;
    private float price;
    private Date trade_date, settlement_date;

    public Trade() {

    }

    public Trade(Long tradeid, int bookid, int counterpartyid, int securityid, int quantity, String status,
            String buy_sell, float price, Date trade_date, Date settlement_date) {
        this.tradeid = tradeid;
        this.bookid = bookid;
        this.counterpartyid = counterpartyid;
        this.securityid = securityid;
        this.quantity = quantity;
        this.status = status;
        this.buy_sell = buy_sell;
        this.price = price;
        this.trade_date = trade_date;
        this.settlement_date = settlement_date;

    }

    @Column(name = "tradeid", nullable = false)
    public Long getTradeid() {
        return tradeid;
    }

    public void setTradeid(Long id) {
        this.tradeid = id;
    }

    @Column(name = "securityid", nullable = false)
    public int getSecurityid() {
        return securityid;
    }

    public void setSecurityid(int id) {
        this.securityid = id;
    }

    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "buy_sell", nullable = false)
    public String getBuy_sell() {
        return buy_sell;
    }

    public void setBuy_sell(String buy_sell) {
        this.buy_sell = buy_sell;
    }

    @Column(name = "price", nullable = false)
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "trade_date", nullable = false)
    public Date getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(Date trade_date) {
        this.trade_date = trade_date;
    }

    @Column(name = "settlement_date", nullable = false)
    public Date getSettlement_date() {
        return settlement_date;
    }

    public void setSettlement_date(Date settlement_date) {
        this.settlement_date = settlement_date;
    }

}