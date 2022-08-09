package com.db.grad.javaapi.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book_User")
public class Book_User implements Serializable{
	
	@Id
	private long id;
	private int bookid;
	private int userid;

    public Book_User() {

    }

    public Book_User(int bookid ,int userid) {
    	this.bookid=bookid;
        this.userid = userid;
    }
    
    @Id
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name = "bookid", nullable = false)
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int id) {
        this.bookid = id;
    }
    
    @Column(name = "userid", nullable = false)
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
}

