package com.Luis0DEV.Domain.Entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import java.util.UUID;

@Entity
@Data
public class tb_prd_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID prd_id;

    @NotBlank(message = "Product name is required.")
    public String prd_product_name;

    @NotBlank(message = "Product description is required.")
    public String prd_product_description;

    @NotNull(message = "Product price is required.")
    public BigDecimal prd_product_price;

    public int prd_product_quantity;
    public int prd_product_stock_quantity;

    public LocalDateTime prd_product_date_create;
    public LocalDateTime prd_product_date_update;

    @ManyToOne
    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id")
    public tb_usr_user prd_usr_user;

    //CONSTRUCTOR
    public tb_prd_product(){}

    //GETTERS
    public UUID get_prd_id() {
        return prd_id;
    }
    public String get_prd_product_name() {
        return prd_product_name;
    }
    public String get_prd_product_description() {
        return prd_product_description;
    }
    public BigDecimal get_prd_product_price() {
        return prd_product_price;
    }
    public int get_prd_product_quantity() {
        return prd_product_quantity;
    }
    public int get_prd_product_stock_quantity() {
        return prd_product_stock_quantity;
    }
    public LocalDateTime get_prd_product_date_create() {
        return prd_product_date_create;
    }
    public LocalDateTime get_prd_product_date_update() {
        return prd_product_date_update;
    }
    public  tb_usr_user get_prd_usr_user() {
        return prd_usr_user;
    }

    //SETTERS
    public void set_prd_id(UUID prd_id) {
        this.prd_id = prd_id;
    }
    public void set_prd_product_name(String prd_product_name) {
        this.prd_product_name = prd_product_name;
    }
    public void set_prd_product_description(String prd_product_description) {
        this.prd_product_description = prd_product_description;
    }
    public void set_prd_product_price(BigDecimal prd_product_price) {
        this.prd_product_price = prd_product_price;
    }
    public void set_prd_product_quantity(int prd_product_quantity) {
        this.prd_product_quantity = prd_product_quantity;
    }
    public void set_prd_product_stock_quantity(int prd_product_stock_quantity) {
        this.prd_product_stock_quantity = prd_product_stock_quantity;
    }
    public void set_prd_product_date_create(LocalDateTime prd_product_date_create) {
        this.prd_product_date_create = prd_product_date_create;
    }
    public void set_prd_product_date_update(LocalDateTime prd_product_date_update) {
        this.prd_product_date_update = prd_product_date_update;
    }
    public void set_prd_usr_user(tb_usr_user prd_usr_user) {
        this.prd_usr_user = prd_usr_user;
    }
}
