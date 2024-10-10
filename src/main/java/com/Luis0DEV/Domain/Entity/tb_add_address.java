package com.Luis0DEV.Domain.Entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class tb_add_address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID add_id;

    @NotBlank(message = "Country is mandatory.")
    public String add_country;

    @NotBlank(message = "State is mandatory.")
    public String add_state;

    @NotBlank(message = "City is mandatory.")
    public String add_city;

    @NotBlank(message = "Address is mandatory.")
    public String add_address;

    @NotBlank(message = "Number is mandatory.")
    public int add_number;

    @ManyToOne
    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id")
    public tb_usr_user add_usr_user;

    //CONSTRUCTOR
    public tb_add_address(){}

    //GETTERS
    public UUID get_add_id() {
        return add_id;
    }
    public String get_add_country() {
        return add_country;
    }
    public String get_add_state() {
        return add_state;
    }
    public String get_add_city() {
        return add_city;
    }
    public String get_add_address() {
        return add_address;
    }
    public int get_add_number() {
        return add_number;
    }
    public tb_usr_user get_add_usr_user() {
        return add_usr_user;
    }

    //SETTERS
    public void set_add_id(UUID add_id) {
        this.add_id = add_id;
    }
    public void set_add_country(String add_country) {
        this.add_country = add_country;
    }
    public void set_add_state(String add_state) {
        this.add_state = add_state;
    }
    public void set_add_city(String add_city) {
        this.add_city = add_city;
    }
    public void set_add_address(String add_address) {
        this.add_address = add_address;
    }
    public void set_add_number(int add_number) {
        this.add_number = add_number;
    }
    public void set_add_usr_user(tb_usr_user add_usr_user) {
        this.add_usr_user = add_usr_user;
    }
}
