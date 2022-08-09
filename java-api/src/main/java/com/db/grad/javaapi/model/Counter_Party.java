package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Counter_Party")
public class Counter_Party {
	@Id
	private int counterpartyid;
    private String name; 
    

    public Counter_Party() {

    }

    public Counter_Party(int counterpartyid, String name) {
    	this.counterpartyid=counterpartyid;
        this.name = name;

    }

    @Column(name = "counterpartyid", nullable = false)
    public int getCounterpartyid() {
        return counterpartyid;
    }
    public void setCounterpartyid(int id) {
        this.counterpartyid = id;
    }
    
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}