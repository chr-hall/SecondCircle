package com.example.SHSWEDEN.Entities;


import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Document(indexName = "listing")
@Setting(settingPath = "static/es-settings.json")
public class Listing {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "Title", nullable = false, length = 50)
    @Field(type = FieldType.Text, name = "Title")
    private String title;

    @Size(max = 500)
    @NotNull
    @Column(name = "Description", nullable = false, length = 50)
    @Field(type = FieldType.Text, name = "Description")
    private String description;

    @Column(name = "Price", nullable = false, precision = 18)
    private Integer price;

    @Column(name = "Image")
    private Integer image;

    //    @NotNull

    @Column(name = "\"Date\"", nullable = true)
    private String date;

    //    @NotNull
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "SellerId", nullable = false)
    @Column(name = "SellerId", nullable = true)
    private Integer seller;

    //    @NotNull
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "CategoryId", nullable = false)
    @Column(name = "CategoryId", nullable = true)
    private Integer category;

    @Column(name = "ShippingCost", precision = 18)
    private BigDecimal shippingCost;

    @NotNull
    @Column(name = "DonationPercent", nullable = false)
    private Integer donationPercent;

    //    @NotNull
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "DonationId", nullable = false)
    @Column(name = "DonationOrg", nullable = true)
    private String donation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Integer getDonationPercent() {
        return donationPercent;
    }

    public void setDonationPercent(Integer donationPercent) {
        this.donationPercent = donationPercent;
    }

    public String getDonation() {
        return donation;
    }

    public void setDonation(String donation) {
        this.donation = donation;
    }

}