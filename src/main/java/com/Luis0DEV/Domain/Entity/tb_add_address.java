package com.Luis0DEV.Domain.Entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class tb_add_address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID add_n_id;

    @NotBlank(message = "Country is mandatory.")
    public String add_c_country;

    @NotBlank(message = "State is mandatory.")
    public String add_c_state;

    @NotBlank(message = "City is mandatory.")
    public String add_c_city;

    @NotBlank(message = "Address is mandatory.")
    public String add_c_address;

    @NotBlank(message = "Zip code is mandatory.")
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "ZIP code must be in the format 00000-000.")
    public String add_c_zipcode;

    @NotBlank(message = "Number is mandatory.")
    public int add_c_number;

    @ManyToOne
    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id")
    public tb_usr_user add_tb_usr_user;

    //CONSTRUCTOR
    public tb_add_address(){}

    //GETTERS
    public UUID get_add_id() {
        return add_n_id;
    }
    public String get_add_country() {
        return add_c_country;
    }
    public String get_add_state() {
        return add_c_state;
    }
    public String get_add_city() {
        return add_c_city;
    }
    public String get_add_address() {
        return add_c_address;
    }
    public String get_add_zipcode() {
        return add_c_zipcode;
    }
    public int get_add_number() {
        return add_c_number;
    }
    public tb_usr_user get_add_usr_user() {
        return add_tb_usr_user;
    }

    //SETTERS
    public void set_add_id(UUID add_n_id) {
        this.add_n_id = add_n_id;
    }
    public void set_add_country(String add_c_country) {
        this.add_c_country = add_c_country;
    }
    public void set_add_state(String add_c_state) {
        this.add_c_state = add_c_state;
    }
    public void set_add_city(String add_c_city) {
        this.add_c_city = add_c_city;
    }
    public void set_add_address(String add_c_address) {
        this.add_c_address = add_c_address;
    }
    public void set_add_zipcode(String add_c_zipcode) {
        this.add_c_zipcode = add_c_zipcode;
    }
    public void set_add_number(int add_c_number) {
        this.add_c_number = add_c_number;
    }
    public void set_add_usr_user(tb_usr_user add_tb_usr_user) {
        this.add_tb_usr_user = add_tb_usr_user;
    }
}
