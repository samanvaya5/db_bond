package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	private int userid;
    private String name, email, role;

    public Users() {

    }

    public Users(int userid, String name, String email,  String role) {
    	this.userid=userid;
        this.name = name;
        this.email = email;
        this.role = role;

    }

    @Column(name = "userid", nullable = false)
    public int getUserid() {
        return userid;
    }
    public void setUserid(int id) {
        this.userid = id;
    }
    
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    
    @Column(name = "role", nullable = false)
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}

