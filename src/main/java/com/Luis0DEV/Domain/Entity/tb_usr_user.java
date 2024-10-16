package com.Luis0DEV.Domain.Entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "tb_usr_user", uniqueConstraints = {
        @UniqueConstraint(columnNames = "usr_nickname"),
        @UniqueConstraint(columnNames = "usr_email"),
        @UniqueConstraint(columnNames = "usr_cpf_cnpj"),
        @UniqueConstraint(columnNames = "usr_phone"),
        @UniqueConstraint(columnNames = "usr_cnpj")
})
public class tb_usr_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID usr_n_id;

    @NotBlank(message = "Name is mandatory.")
    @Size(max = 20, message = "The name must have a maximum of 20 characters.")
    public String usr_c_name_first;

    @NotBlank(message = "Last name is mandatory.")
    @Size(max = 20, message = "The last name must have a maximum of 20 characters.")
    public String usr_c_name_last;

    @NotBlank(message = "Nickname is mandatory.")
    @Size(max = 20, message = "The nickname must have a maximum of 20 characters.")
    public String usr_c_nickname;

    @NotBlank(message = "E-mail is mandatory.")
    @Size(max = 100, message = "The email must have a maximum of 100 characters.")
    public String usr_c_email;

    @NotBlank(message = "Password is mandatory.")
    @Size(max = 100, message = "The password must have a maximum of 100 characters.")
    public String usr_c_password;

    @NotBlank(message = "CPF or CNPJ is mandatory.")
    @Pattern(regexp = "\\d{11}|\\d{14}", message = "The CPF must have 11 digits and the CNPJ must have 14 digits.")
    public String usr_c_cpf_cnpj;

    @NotBlank(message = "Phone is mandatory.")
    @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "The phone must be in the format (XX) XXXXX-XXXX .")
    public String usr_c_phone;

    @NotBlank(message = "Language is mandatory.")
    public String usr_c_language;

    @NotBlank(message = "Format of currency is mandatory.")
    public String usr_c_currency;

    @NotBlank(message = "Method of Payment is mandatory.")
    public String usr_c_payment;

    public String usr_c_status_payment;
    public String usr_c_status_account;

    @NotBlank(message = "Birthday is mandatory.")
    @Past(message = "The date of birth must be in the past.")
    public LocalDate usr_ld_birthday;

    public LocalDateTime usr_ld_date_created;
    public LocalDateTime usr_ld_last_login;

    @NotBlank(message = "CNPJ is mandatory.")
    @Pattern(regexp = "\\d{14}", message = "The CNPJ must have 14 digits.")
    public String usr_c_cnpj;
    public String usr_c_status_seller;

    @OneToMany(mappedBy = "prd_c_usr_user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<tb_prd_product> usr_c_prd_product;

    @OneToMany(mappedBy = "add_c_usr_user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<tb_add_address> usr_c_add_address;

    //CONSTRUCTOR
    public tb_usr_user(){}

    //GETTERS
    public UUID get_usr_id() {
        return usr_n_id;
    }
    public String get_usr_name_first() {
        return usr_c_name_first;
    }
    public String get_usr_name_last() {
        return usr_c_name_last;
    }
    public String get_usr_nickname() {
        return usr_c_nickname;
    }
    public String get_usr_email() {
        return usr_c_email;
    }
    public String get_usr_password() {
        return usr_c_password;
    }
    public String get_usr_cpf_cnpj() {
        return usr_c_cpf_cnpj;
    }
    public String get_usr_phone() {
        return usr_c_phone;
    }
    public String get_usr_language() {
        return usr_c_language;
    }
    public String get_usr_currency() {
        return usr_c_currency;
    }
    public String get_usr_payment() {
        return usr_c_payment;
    }
    public String get_usr_status_payment() {
        return usr_c_status_payment;
    }
    public String get_usr_status_account() {
        return usr_c_status_account;
    }
    public LocalDate get_usr_birthday() {
        return usr_ld_birthday;
    }
    public LocalDateTime get_usr_date_created() {
        return usr_ld_date_created;
    }
    public LocalDateTime get_usr_last_login() {
        return usr_ld_last_login;
    }
    public String get_usr_cnpj() {
        return usr_c_cnpj;
    }
    public String get_usr_status_seller() {
        return usr_c_status_seller;
    }
    public List<tb_prd_product> get_usr_prd_product() {
        return usr_c_prd_product;
    }
    public List<tb_add_address> get_usr_add_address() {
        return usr_c_add_address;
    }

    //SETTERS
    public void set_usr_id(UUID usr_n_id) {
        this.usr_n_id = usr_n_id;
    }
    public void set_usr_name_first(String usr_c_name_first) {
        this.usr_c_name_first = usr_c_name_first;
    }
    public void set_usr_name_last(String usr_c_name_last) {
        this.usr_c_name_last = usr_c_name_last;
    }
    public void set_usr_nickname(String usr_c_nickname) {
        this.usr_c_nickname = usr_c_nickname;
    }
    public void set_usr_email(String usr_c_email) {
        this.usr_c_email = usr_c_email;
    }
    public void set_usr_password(String usr_c_password) {
        this.usr_c_password = usr_c_password;
    }
    public void set_usr_cpf_cnpj(String usr_c_cpf_cnpj) {
        this.usr_c_cpf_cnpj = usr_c_cpf_cnpj;
    }
    public void set_usr_phone(String usr_c_phone) {
        this.usr_c_phone = usr_c_phone;
    }
    public void set_usr_language(String usr_c_language) {
        this.usr_c_language = usr_c_language;
    }
    public void set_usr_currency(String usr_c_currency) {
        this.usr_c_currency = usr_c_currency;
    }
    public void set_usr_payment(String usr_c_payment) {
        this.usr_c_payment = usr_c_payment;
    }
    public void set_usr_status_payment(String usr_c_status_payment) {
        this.usr_c_status_payment = usr_c_status_payment;
    }
    public void set_usr_status_account(String usr_c_status_account) {
        this.usr_c_status_account = usr_c_status_account;
    }
    public void set_usr_birthday(LocalDate usr_ld_birthday) {
        this.usr_ld_birthday = usr_ld_birthday;
    }
    public void set_usr_date_created(LocalDateTime usr_ld_date_created) {
        this.usr_ld_date_created = usr_ld_date_created;
    }
    public void set_usr_last_login(LocalDateTime usr_ld_last_login) {
        this.usr_ld_last_login = usr_ld_last_login;
    }
    public void set_usr_cnpj(String usr_c_cnpj) {
        this.usr_c_cnpj = usr_c_cnpj;
    }
    public void set_usr_status_seller(String usr_c_status_seller) {
        this.usr_c_status_seller = usr_c_status_seller;
    }
    public void set_usr_prd_product(List<tb_prd_product> usr_c_prd_product) {
        this.usr_c_prd_product = usr_c_prd_product;
    }
    public void set_usr_add_address(List<tb_add_address> usr_c_add_address) {
        this.usr_c_add_address = usr_c_add_address;
    }
}
