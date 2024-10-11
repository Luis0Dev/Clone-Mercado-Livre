package com.Luis0DEV.Domain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class tb_geo_geocode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID  geo_n_id;

    public String geo_c_name;
    public String geo_c_description;
    public String geo_c_category;

    public double geo_d_latitude;
    public double geo_d_longitude;

    //CONSTRUCTOR
    public tb_geo_geocode(){}

    //GETTERS
    public UUID get_geo_id(){
        return geo_n_id;
    }
    public String get_geo_name(){
        return geo_c_name;
    }
    public String get_geo_description(){
        return geo_c_description;
    }
    public String get_geo_category(){
        return geo_c_category;
    }
    public double get_geo_latitude(){
        return geo_d_latitude;
    }
    public double get_geo_longitude(){
        return geo_d_longitude;
    }

    //SETTERS
    public void set_geo_id(UUID geo_n_id){
        this.geo_n_id = geo_n_id;
    }
    public void set_geo_name(String geo_c_name){
        this.geo_c_name = geo_c_name;
    }
    public void set_geo_description(String geo_c_description){
        this.geo_c_description = geo_c_description;
    }
    public void set_geo_category(String geo_c_category){
        this.geo_c_category = geo_c_category;
    }
    public void set_geo_latitude(double geo_d_latitude){
        this.geo_d_latitude = geo_d_latitude;
    }
    public void set_geo_longitude(double geo_d_longitude){
        this.geo_d_longitude = geo_d_longitude;
    }
}
