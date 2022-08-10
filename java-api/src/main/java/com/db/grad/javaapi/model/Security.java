package com.db.grad.javaapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Securities")
public class Security {
    @Id
    private int securityid;
    private String isin, cusip, issuer, typeval, status;
    private Date maturity_date;
    private float coupon;
    private int facevalue;

    public Security() {

    }

    public Security(int securityid, String isin, String cusip, String issuer, String typeval, String status,
            Date maturity_date, float coupon, int facevalue) {
        this.securityid = securityid;
        this.isin = isin;
        this.cusip = cusip;
        this.issuer = issuer;
        this.typeval = typeval;
        this.status = status;
        this.maturity_date = maturity_date;
        this.coupon = coupon;
        this.facevalue = facevalue;

    }

    @Column(name = "securityid", nullable = false)
    public int getSecurityid() {
        return securityid;
    }

    public void setSecurityid(int id) {
        this.securityid = id;
    }

    @Column(name = "isin", nullable = false)
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    @Column(name = "cusip", nullable = false)
    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    @Column(name = "issuer", nullable = false)
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Column(name = "typeval", nullable = false)
    public String getTypeval() {
        return typeval;
    }

    public void setTypeval(String typeval) {
        this.typeval = typeval;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "maturity_date", nullable = false)
    public Date getmaturity_date() {
        return maturity_date;
    }

    public void setmaturity_date(Date maturity_date) {
        this.maturity_date = maturity_date;
    }

    @Column(name = "coupon", nullable = false)
    public float getCoupon() {
        return coupon;
    }

    public void setCoupon(float coupon) {
        this.coupon = coupon;
    }

    @Column(name = "facevalue", nullable = false)
    public int getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(int facevalue) {
        this.facevalue = facevalue;
    }
}