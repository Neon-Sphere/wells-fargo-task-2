package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private float purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(Long portfolioId, String name, String category, Float purchasePrice, Float purchaseDate, Long quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getAdvisorId() {
        return portfolioId;
    }

    public void setAdvisorId(Long advisorId) {
        this.portfolioId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Float getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Float purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
