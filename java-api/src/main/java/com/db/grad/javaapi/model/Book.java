package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

	@Id
	private int bookid;
	private String book_name;

  public Book() {

  }

  public Book(int bookid ,String book_name) {
  	this.bookid=bookid;
    this.book_name = book_name;
  }

  @Column(name = "bookid", nullable = false)
  public int getBookid() {
      return bookid;
  }
  public void setBookid(int id) {
      this.bookid = id;
  }
  
  @Column(name = "book_name", nullable = false)
  public String getBook_name() {
      return book_name;
  }
  public void setBook_name(String book_name) {
      this.book_name = book_name;
  }
}

